/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-11.
 *
 * @author chenlong
 * @since 1.0
 */
public class DateTimes {

    public static boolean beforeOrEqualNow(Date basicDate, int secondOffset) {
        DateTime thisTime = new DateTime(basicDate).plusSeconds(secondOffset);
        DateTime now = new DateTime();
        return (thisTime.compareTo(now) <= 0);
    }

}
