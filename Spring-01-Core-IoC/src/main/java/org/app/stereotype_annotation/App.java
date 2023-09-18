package org.app.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext  container = new AnnotationConfigApplicationContext(ConfigCourse.class);

        container.getBean(Java.class).getTeachingHours();


    }
}
