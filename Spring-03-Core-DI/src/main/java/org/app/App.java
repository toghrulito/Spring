package org.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
        container.getBean(Java.class).getTeachingHours();


    }
}
