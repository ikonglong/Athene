/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.ex;


import com.quest.athene.application.app.Presentation;

/**
 * Here is Javadoc.
 * <p/>
 * Created by chenlong on 2015-05-08.
 *
 * @author chenlong
 * @since 1.0
 */
public class Error implements Presentation {

    private Id id;
    private String message;
    private String url;

    public Error() {
    }

    private Error(Error.Id errorId, String message) {
        this.id = errorId;
        this.message = message;
    }

    public static Error of(Error.Id errorId, String message) {
        return new Error(errorId, message);
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public interface Id {
        String get();
    }

}
