package com.javachallengers.solid.ocp.messageprocessor.with;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MessageProcessingApp {
    
    private final MessageProcessor messageProcessor;

    @Autowired
    public MessageProcessingApp(MessageProcessor messageProcessor) {
        this.messageProcessor = messageProcessor;
    }

    public void run(String message) {
        messageProcessor.process(message);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MessageProcessingApp.class);
        ApplicationContext ctx = app.run(args);

        var messageProcessor = ctx.getBean(MessageProcessor.class);
        
        MessageProcessingApp myApp = ctx.getBean(MessageProcessingApp.class);
        myApp.run("Hello, this is a test message!");
        messageProcessor.process("Java Challengers ");
    }

}