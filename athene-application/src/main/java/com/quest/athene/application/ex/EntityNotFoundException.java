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
public class EntityNotFoundException extends ApplicationException {

    private static final String MSG_TEMPLATE = "Expect %s present, but actual absent";

    public EntityNotFoundException(String message) {
        super(CommonErrorId.server_data_stale, message);
    }

    public EntityNotFoundException(String msgFormat, Object... msgArgs) {
        super(CommonErrorId.server_data_stale, String.format(msgFormat, msgArgs));
    }

    public EntityNotFoundException(Class<?> entityClass) {
        super(CommonErrorId.server_data_stale, String.format(MSG_TEMPLATE, entityClass.getSimpleName()));
    }

    public EntityNotFoundException(Expected expected) {
        super(CommonErrorId.server_data_stale, String.format(MSG_TEMPLATE, expected));
    }

    public EntityNotFoundException(Error.Id errorId, String message) {
        super(errorId, message);
    }

}
