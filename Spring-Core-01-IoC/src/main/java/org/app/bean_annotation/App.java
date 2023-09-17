package org.app.bean_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();


        String bean = container.getBean(String.class);
        System.out.println(bean);


    }
}
