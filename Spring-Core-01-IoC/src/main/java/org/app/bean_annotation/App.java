package org.app.bean_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        PartTimeMentor p1 = container.getBean("p1", PartTimeMentor.class);
        p1.createAccount();


        String bean = container.getBean(String.class);
        System.out.println(bean);


    }
}
