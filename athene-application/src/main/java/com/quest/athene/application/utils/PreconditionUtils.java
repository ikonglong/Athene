/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.utils;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-08.
 *
 * @author chenlong
 * @since 1.0
 */
public class PreconditionUtils {

    public static void checkRequired(String field, String val) {
        Preconditions.checkArgument(StringUtils.isNotBlank(val), "%s required", field);
    }

    public static void checkRequired(String field, List<?> val) {
        Preconditions.checkArgument(!CollectionUtils.isEmpty(val), "%s must not be null or empty", field);
    }

    public static void checkRequired(String field, Object val) {
        Preconditions.checkArgument((val != null), "%s required", field);
    }

    public static void checkGreaterThanZero(String field, int val) {
        checkGreaterThan(0, field, val);
    }

    public static void checkGreaterThan(int bound, String field, int val) {
        Preconditions.checkArgument((val > bound), "%s must be greater than %s", field, bound);
    }

    public static void checkGreaterThanOrEqZero(String field, int val) {
        checkGreaterThanOrEq(0, field, val);
    }

    public static void checkGreaterThanOrEq(int bound, String field, int val) {
        Preconditions.checkArgument((val >= bound), "%s must be greater than or eq %s", field, bound);
    }

}
