package com.app.proxy;

import com.app.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
