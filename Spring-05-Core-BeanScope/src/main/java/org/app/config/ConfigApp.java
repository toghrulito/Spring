package org.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="org.app")
@ComponentScan(basePackages = {"org.app.proxy","org.app.service","org.app.repository"})
public class ConfigApp {
}
