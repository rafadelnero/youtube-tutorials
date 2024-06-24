package com.javachallengers.solid.dip.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountManager accountManager = context.getBean(AccountManager.class);
        accountManager.manage("user123");
    }
}