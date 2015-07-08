package com.quest.athene.domain.repository;

import com.google.common.base.Optional;
import com.quest.athene.domain.model.Comment;
import org.springframework.stereotype.Repository;

public interface CommentRepository {

    public void save(Comment comment);

    public Optional<Comment> load(long commentId);

}
