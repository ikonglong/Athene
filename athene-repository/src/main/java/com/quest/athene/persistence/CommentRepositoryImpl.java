package com.quest.athene.persistence;

import com.google.common.base.Optional;
import com.quest.athene.domain.model.Comment;
import com.quest.athene.domain.repository.CommentRepository;
import com.quest.athene.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("commentRepository")
public class CommentRepositoryImpl implements CommentRepository {

//    @Autowired
//    private CommentMapper commentMapper;

    @Override
    public void save(Comment comment) {
//        commentMapper.insert(comment);
    }

    @Override
    public Optional<Comment> load(long commentId) {
//        return Optional.fromNullable(commentMapper.findById(commentId));
        return null;
    }
}
