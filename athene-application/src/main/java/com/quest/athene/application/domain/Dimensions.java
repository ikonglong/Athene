/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.domain;

import com.quest.athene.application.utils.PreconditionUtils;

import static java.lang.String.format;

/**
 * Represents the size of something using width and height. Any other class that represents
 * the width and height of something should extend this class.
 *
 * @author chenlong
 * @since 1.0
 */
public class Dimensions extends ValueObject {

    private int width;
    private int height;

    public void validate() {
        PreconditionUtils.checkGreaterThanZero(format("%s.width"), width);
        PreconditionUtils.checkGreaterThanZero(format("%s.height"), height);
    }

}
