package com.app.repository;

import com.app.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
