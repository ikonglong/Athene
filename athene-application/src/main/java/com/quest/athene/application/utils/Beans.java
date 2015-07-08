/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;

import com.quest.athene.application.ex.ApplicationException;
import com.quest.athene.application.ex.CommonErrorId;
import com.google.common.base.Optional;
import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeansException;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-06-01.
 *
 * @author chenlong
 * @since 1.0
 */
public class Beans {

    private static final Logger logger = LoggerFactory.getLogger(Beans.class);

    /**
     * Copy the property values of the given source bean into the given target bean.
     * <p>Note: The source and target classes do not have to match or even be derived
     * from each other, as long as the properties match, even if they are private.
     * Any bean properties that they are of type {@link org.slf4j.Logger} or modified
     * by the {@code static} modifier, or their type don't match will silently be ignored.
     *
     * @param source           the source bean
     * @param target           the target bean
     * @param ignoreProperties array of property names to ignore
     * @throws BeansException if the copying failed
     * @see BeanWrapper
     */
    public static void copyProperties(Object source, Object target, String... ignoreProperties) {
        Assert.notNull(source, "Source must not be null");
        Assert.notNull(target, "Target must not be null");

        try {
            Optional<HashSet<String>> ignorePropertySet = Optional.fromNullable(
                    ObjectUtils.isEmpty(ignoreProperties) ? null : Sets.newHashSet(ignoreProperties)
            );

            Class<?> searchType = source.getClass();
            while (!Object.class.equals(searchType) && searchType != null) {
                Field[] fields = searchType.getDeclaredFields();
                for (Field sourceField : fields) {
                    // Automatically ignore slf4j logger property
                    if (isSelf4jLogger(sourceField)) {
                        logIgnoredFieldAsDebug(sourceField);
                        continue;
                    }

                    // Automatically ignore static properties
                    if (isStatic(sourceField)) {
                        logIgnoredFieldAsDebug(sourceField);
                        continue;
                    }

                    if (ignorePropertySet.isPresent() && ignorePropertySet.get().contains(sourceField.getName())) {
                        logIgnoredFieldAsDebug(sourceField);
                        continue;
                    }

                    Field targetField = ReflectionUtils.findField(target.getClass(),
                            sourceField.getName(), sourceField.getType());
                    if (targetField == null) {
                        if (logger.isDebugEnabled()) {
                            Logs.debug(logger, "Ignore property because their types don't match: {}", sourceField);
                        }
                        continue;
                    }

                    copyProperty(source, sourceField, target, targetField);
                }
                searchType = searchType.getSuperclass();
            }
        } catch (Exception ex) {
            throw new BeanPropertyCopyingException(ex, "Error while copying properties from {} to {}",
                    source.getClass().getName(), target.getClass().getName());
        }
    }

    private static boolean isStatic(Field field) {
        int modifiers = field.getModifiers();
        return Modifier.isStatic(modifiers);
    }

    private static boolean isSelf4jLogger(Field field) {
        Class<?> type = field.getType();
        return Logger.class.isAssignableFrom(type);
    }

    private static void copyProperty(Object source, Field sourceField, Object target, Field targetField) {
        Object sourceVal = valueOf(sourceField, source);
        if (sourceVal == null) {
            if (logger.isDebugEnabled()) {
                Logs.debug(logger, "Ignore property because its value is null: {}", sourceField);
            }
            return;
        }
        setValueFor(targetField, target, sourceVal);
    }

    private static <T> T valueOf(Field field, Object obj) {
        ReflectionUtils.makeAccessible(field);
        return (T) ReflectionUtils.getField(field, obj);
    }

    public static void setValueFor(Field field, Object obj, Object value) {
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, obj, value);
    }

    private static void logIgnoredFieldAsDebug(Field field) {
        if (logger.isDebugEnabled()) {
            Logs.debug(logger, "Ignore property while copying bean properties:{}", field);
        }
    }

    public static class BeanPropertyCopyingException extends ApplicationException {
        public BeanPropertyCopyingException(Throwable cause, String msgFormat, Object... msgArgs) {
            super(CommonErrorId.internal_server_error, cause, msgFormat, msgArgs);
        }
    }

}
