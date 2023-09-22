package org.app.proxy;

import org.app.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
