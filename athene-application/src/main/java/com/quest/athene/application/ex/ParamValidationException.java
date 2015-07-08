/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-13.
 *
 * @author chenlong
 * @since 1.0
 */
public class ParamValidationException extends ApplicationException {

    public ParamValidationException(Error.Id errorId, String message) {
        super(errorId, message);
    }

}
