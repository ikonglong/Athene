/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.shared;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-22.
 *
 * @author chenlong
 * @since 1.0
 */
public abstract class CommonModel {

    protected String format(String msg) {
        return String.format(msg, thisClassSimpleName());
    }

    protected String thisClassSimpleName() {
        return this.getClass().getSimpleName();
    }

}
