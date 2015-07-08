/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-11.
 *
 * @author chenlong
 * @since 1.0
 */
public class Logs {

    private static final Logger logger = LoggerFactory.getLogger(Logs.class);

    private static final ThreadLocal<String> localTraceId = new ThreadLocal<>();

    public static void setTraceId(String traceId) {
        localTraceId.set(traceId);
        debugWithoutPrefixTraceId(logger, "Set traceId for current thread: {}", traceId);
    }
    public static void clearTraceId() {
        // TODO 是否真的有必要使用同步？
        synchronized (localTraceId) {
            String traceId = localTraceId.get();
            localTraceId.remove();
            debugWithoutPrefixTraceId(logger, "Cleared traceId from current thread: {}", traceId);
        }
    }

    public static String prefixTraceIdTo(String log) {
        return String.format("[traceId:%s] %s", localTraceId.get(), log);
    }

    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }

    /**
     * Log the given message at the DEBUG level according to the specified format
     * and arguments. And this method prefixes the current request id to the resulted message.
     *
     * @param logger
     * @param format
     * @param args
     */
    public static void debug(Logger logger, String format, Object... args) {
        debug(logger, true, format, args);
    }

    /**
     * Log the given message at the DEBUG level according to the specified format
     * and arguments. But this method don't prefix the current request id to the resulted message.
     *
     * @param logger
     * @param format
     * @param args
     */
    public static void debugWithoutPrefixTraceId(Logger logger, String format, Object... args) {
        debug(logger, false, format, args);
    }

    public static void warn(Logger logger, String format, Object... args) {
        if (logger.isWarnEnabled()) {
            logger.warn(prefixTraceIdTo(format), args);
        }
    }

    public static void error(Logger logger, String format, Object... args) {
        logger.error(format, args);
    }

    public static void error(Logger logger, Throwable ex, String format, Object... args) {
        String errorMsg = MessageFormatter.arrayFormat(prefixTraceIdTo(format), args).getMessage();
        logger.error(errorMsg, ex);
    }

    private static void debug(Logger logger, boolean needPrefixRequestId, String format, Object... args) {
        if (!logger.isDebugEnabled()) {
            return;
        }

        if (needPrefixRequestId) {
            logger.debug(prefixTraceIdTo(format), args);
        } else {
            logger.debug(format, args);
        }
    }
}
