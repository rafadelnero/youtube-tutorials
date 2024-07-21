package com.javachallengers.aop.service;

import com.javachallengers.aop.AuditAction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    public void performTask() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task performed");
    }

    public List<String> returnData() {
        return List.of("test1", "test2", "test3");
    }

    public void performTaskWithException() {
        throw new RuntimeException("Error within this method...");
    }

    @AuditAction("update...")
    public void updateWithUserAuditing() {
        System.out.println("Updated data...");
    }
}