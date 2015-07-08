/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-14.
 *
 * @author chenlong
 * @since 1.0
 */
public class AuthException extends ApplicationException {

    public AuthException(String msgFormat, Object... msgArgs) {
        super(CommonErrorId.unauthorized, msgFormat, msgArgs);
    }

    public AuthException(Error.Id errorId, String msgFormat, Object... msgArgs) {
        super(errorId, msgFormat, msgArgs);
    }

    public AuthException(Throwable cause, String msgFormat, Object... msgArgs) {
        super(CommonErrorId.unauthorized, cause, msgFormat, msgArgs);
    }

}
