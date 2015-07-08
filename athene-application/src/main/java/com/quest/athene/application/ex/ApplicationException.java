/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-08.
 *
 * @author chenlong
 * @since 1.0
 */
public class ApplicationException extends RuntimeException {

    private Error.Id errorId;

    public ApplicationException(Error.Id errorId, String message) {
        super(message);
        this.errorId = errorId;
    }

    public ApplicationException(Error.Id errorId, String msgFormat, Object... msgArgs) {
        this(errorId, String.format(msgFormat, msgArgs));
    }

    public ApplicationException(Error.Id errorId, String message, Throwable cause) {
        super(message, cause);
        this.errorId = errorId;
    }

    public ApplicationException(Error.Id errorId, Throwable cause, String msgFormat, Object... msgArgs) {
        this(errorId, String.format(msgFormat, msgArgs), cause);
    }

    public Error.Id errorId() {
        return errorId;
    }

}
