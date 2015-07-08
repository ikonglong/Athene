package com.quest.athene.domain.service;

import com.google.common.base.Optional;
import com.quest.athene.domain.model.Comment;
import com.quest.athene.domain.model.User;
import com.quest.athene.domain.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentService {

    @Autowired
    private CommentRepository CommentRepositoryImpl;

    public void replyToComment(String replyContent, User replier, long targetCommentId) {
        Comment comment = new Comment(replyContent, replier);
        comment.replyToComment(targetCommentId);
        CommentRepositoryImpl.save(comment);
    }

    public void commentOnQuestion(String content, User commenter, long questionId) {
        Comment comment = new Comment(content, commenter);
        comment.commentOnQuestion(questionId);
        CommentRepositoryImpl.save(comment);
    }

    public void commentOnAnswer(String content, User commenter, long answerId) {
        Comment comment = new Comment(content, commenter);
        comment.commentOnAnswer(answerId);
        CommentRepositoryImpl.save(comment);
    }

    public void removeComment(long commentId, User operator) {
        Optional<Comment> comment = CommentRepositoryImpl.load(commentId);
        if (!comment.isPresent()) {
            // TODO 做合适的处理
            return;
        }
        comment.get().remove(operator);
    }

}
