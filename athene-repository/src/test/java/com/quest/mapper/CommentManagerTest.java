package com.quest.mapper;

import com.quest.athene.domain.model.Comment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2014/8/25.
 */
public class CommentManagerTest extends  BaseTest {

    @Autowired
    private CommentMapper commentManager;

    @Test
    public void testSubmitComment() throws Exception {

        Comment comment = new Comment();
        comment.setTargetId(1);
        comment.setContent( "你的问题范围太大，根本没办法回答！");
        comment.setNumOfComments(0);
        comment.setTargetType(0); //! 对问题进行评论
        commentManager.submitComment(comment);
    }

}
