package org.app.repository;

import org.app.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
