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
public class IllegalEntityStateException extends BusinessException {

    public IllegalEntityStateException(String message) {
        super(CommonErrorId.server_data_stale, message);
    }

    public IllegalEntityStateException(String msgFormat, Object... msgArgs) {
        super(CommonErrorId.server_data_stale, msgFormat, msgArgs);
    }

}
