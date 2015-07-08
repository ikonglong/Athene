/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * Guava cache utils
 *
 * @author chenlong
 * @since 1.0
 */
public final class GuavaCaches {

    public static <K, V> Cache<K, V> createCache() {
        return CacheBuilder.newBuilder()
                .maximumSize(1000)
                .build();
    }

}
