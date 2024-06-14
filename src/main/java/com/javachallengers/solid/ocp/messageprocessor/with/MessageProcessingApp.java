package com.javachallengers.solid.ocp.messageprocessor.with;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MessageProcessingApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MessageProcessingApp.class);
        ApplicationContext ctx = app.run(args);

        var messageProcessor = ctx.getBean(MessageProcessor.class);
        messageProcessor.process("Hello, this is a test message!");
    }

}