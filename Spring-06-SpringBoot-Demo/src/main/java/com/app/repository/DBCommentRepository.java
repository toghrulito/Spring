package com.app.repository;

import com.app.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing Comment " + comment.getText());
    }
}
