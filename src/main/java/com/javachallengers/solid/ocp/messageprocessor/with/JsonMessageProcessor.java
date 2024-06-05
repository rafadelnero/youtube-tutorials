package com.javachallengers.solid.ocp.messageprocessor.with;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("json")
@Component
public class JsonMessageProcessor implements MessageProcessor {
    @Override
    public void process(String message) {
        System.out.println("Processing JSON message: " + message);
    }
}