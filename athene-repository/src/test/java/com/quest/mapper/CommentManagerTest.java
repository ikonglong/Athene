package com.quest.mapper;

import com.quest.model.Comment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2014/8/25.
 */
public class CommentManagerTest extends  BaseTest {

    @Autowired
    private  CommentManager commentManager;

    @Test
    public void testSubmitComment() throws Exception {

        Comment comment = new Comment();
        comment.targetId = 1;
        comment.content = "你的问题范围太大，根本没办法回答！";
        comment.numOfComments = 0;
        commentManager.submitComment(comment); 
    }

}
