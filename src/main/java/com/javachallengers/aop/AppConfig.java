package com.javachallengers.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.javachallengers.aop")

@ComponentScan(basePackages = {"com.javachallengers.aop", "com.javachallengers.service"})
@EnableAspectJAutoProxy
public class AppConfig {
}