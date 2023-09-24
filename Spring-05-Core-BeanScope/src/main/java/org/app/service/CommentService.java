package org.app.service;

import org.app.model.Comment;
import org.app.proxy.CommentNotificationProxy;
import org.app.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy){
        this.commentRepository=commentRepository;
        this.commentNotificationProxy=commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
