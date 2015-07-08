/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-28.
 *
 * @author chenlong
 * @since 1.0
 */
public class BusinessException extends ApplicationException {

    public BusinessException(String message) {
        super(CommonErrorId.business_constraint_violated, message);
    }

    public BusinessException(String msgFormat, Object... msgArgs) {
        super(CommonErrorId.business_constraint_violated, msgFormat, msgArgs);
    }

    public BusinessException(Error.Id errorId, String message) {
        super(errorId, message);
    }

    public BusinessException(Error.Id errorId, String msgFormat, Object... msgArgs) {
        super(errorId, msgFormat, msgArgs);
    }

}
