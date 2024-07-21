package com.javachallengers.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditAspect {

    @Pointcut("@annotation(auditAction)")
    public void auditPointcut(AuditAction auditAction) {
    }

    @Before("auditPointcut(auditAction)")
    public void auditAction(JoinPoint joinPoint, AuditAction auditAction) {
        // Access user information, typically from security context or session
        String username = "userTest";

        // Log the audit information
        System.out.println("User " + username + " performed " + auditAction.value() + " on " + joinPoint.getSignature().getName());

        // Alternatively, save the audit record in a database or external system
        // auditService.recordAction(username, auditAction.value(), joinType.getSignature().getName());
    }
}