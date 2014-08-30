package com.quest.athene.domain.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class User extends BaseEntity {

    /**
     * 用户ID
     */
    private long userId;

    /**
     * 用户名
     */
    private String username;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
