package org.app;

import org.app.config.ConfigApp;
import org.app.model.Comment;
import org.app.service.CommentService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;

import java.io.IOException;
import java.io.ObjectInputFilter;

public class App {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        CommentService bean = container.getBean(CommentService.class);

        bean.publishComment(comment);


    }
}
