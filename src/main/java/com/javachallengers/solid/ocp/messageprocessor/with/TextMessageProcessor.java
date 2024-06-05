package com.javachallengers.solid.ocp.messageprocessor.with;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("text")
@Component
public class TextMessageProcessor implements MessageProcessor {
    @Override
    public void process(String message) {
        System.out.println("Processing text message: " + message);
    }
}