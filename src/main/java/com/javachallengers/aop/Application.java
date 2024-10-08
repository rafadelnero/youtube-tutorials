package com.javachallengers.aop;

import com.javachallengers.aop.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MyService myService = context.getBean(MyService.class);

//        myService.performTask();

//        myService.performTaskWithException();
//
        myService.returnData();
        myService.updateWithUserAuditing();

        context.close();
    }

}