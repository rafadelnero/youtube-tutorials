package com.javachallengers.solid.dip.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AccountService.class)
public class AppConfig {
}