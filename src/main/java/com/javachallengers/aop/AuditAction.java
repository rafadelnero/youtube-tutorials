package com.javachallengers.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // This annotation is applicable to methods only.
@Retention(RetentionPolicy.RUNTIME) // The annotation is available at runtime.
public @interface AuditAction {
    String value(); // This parameter can be used to describe the specific action for auditing purposes.
}