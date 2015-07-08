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
public enum CommonErrorId implements Error.Id {

    bad_request,
    unauthorized,
    invalid_params,
    no_permission_for_this_api,
    business_constraint_violated,

    internal_server_error,
    service_unavailable,

    server_data_stale;

    @Override
    public String get() {
        return this.toString();
    }

}
