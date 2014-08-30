package com.quest.athene.domain.model;

import java.util.Date;

/**
 * Created by milo on 2014/8/30.
 */
public abstract class BaseEntity {

    private String isDeleted;

    private long creatorId;
    private Date createdTime;
    private long modifierId;
    private Date modifiedTime;

    protected BaseEntity() {}

    protected BaseEntity(User creator) {
        this.setCreatorId(creator.getUserId());
        this.setCreatedTime(new Date());
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public long getModifierId() {
        return modifierId;
    }

    public void setModifierId(long modifierId) {
        this.modifierId = modifierId;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public static enum YesOrNo {
        YES("y"), NO("n");

        private String val;

        private YesOrNo(String val) {
            this.val = val;
        }

        public String val() { return this.val; }
    }

}
