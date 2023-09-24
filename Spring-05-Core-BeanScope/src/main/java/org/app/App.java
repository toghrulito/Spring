package org.app;

import org.app.config.ConfigApp;
import org.app.model.Comment;
import org.app.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        CommentService bean = container.getBean(CommentService.class);
        CommentService bean2 = container.getBean(CommentService.class);


        System.out.println(bean == bean2);
    }
}
