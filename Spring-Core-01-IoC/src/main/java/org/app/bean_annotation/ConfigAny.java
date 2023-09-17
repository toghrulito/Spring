package org.app.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {


    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    Integer integer(){
        return 100;
    }
}
