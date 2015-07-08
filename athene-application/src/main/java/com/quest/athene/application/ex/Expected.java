/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;

/**
 * 该类表示期望的结果、值等。
 *
 * @author chenlong
 * @since 1.0
 */
public class Expected {

    private String value;

    private Expected() {
    }

    private Expected(String value) {
        this.value = value;
    }

    public static Expected of(String value) {
        return new Expected(value);
    }

    @Override
    public String toString() {
        return this.value;
    }

}
