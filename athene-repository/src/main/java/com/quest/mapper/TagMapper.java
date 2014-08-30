package com.quest.mapper;

import com.quest.athene.domain.model.QuestionTag;

/**
 * Created by hongfeiyanghf on 14-8-24.
 */
public interface TagMapper {

    //! 新增一个标签
    public void submitTag(QuestionTag tag);

    //! 根据标签ID 获取一个标签
    public QuestionTag findTagByTagId(long tagId);

    //! 根据标签内容获取一个标签
    public QuestionTag findTagByTagContent(String tag);
}
