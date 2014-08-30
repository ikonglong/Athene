package com.quest.athene.domain.model;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public class QuestionTag {

    /**
     * 问题标签
     */
    private long tagId;

    /**
     * 问题标签
     */
    private String tagContent;

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent;
    }
}
