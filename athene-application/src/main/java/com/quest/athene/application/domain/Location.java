/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.domain;

import com.quest.athene.application.utils.PreconditionUtils;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-21.
 *
 * @author chenlong
 * @since 1.0
 */
public class Location extends ValueObject {

    /**
     * 与一个宽度相比的百分点数，而非像素数。
     */
    private int xPercentage;
    /**
     * 与一个高度相比的百分点数，而非像素数。
     */
    private int yPercentage;

    public void validate() {
        PreconditionUtils.checkGreaterThanOrEqZero("location.xPercentage", xPercentage);
        PreconditionUtils.checkGreaterThanOrEqZero("location.yPercentage", yPercentage);
    }

}
