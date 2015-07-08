/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;

/**
 * @author chenlong
 * @since 1.0
 */
public class CacheException extends ApplicationException {

    public CacheException(String message, Throwable cause) {
        super(CommonErrorId.internal_server_error, message, cause);
    }

}
