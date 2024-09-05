package com.javachallengers.aop;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Example {
    public List<String> list;

    public static void main(String[] args) throws Exception {
        Field field = Example.class.getDeclaredField("list");
        Type fieldType = field.getGenericType();
        System.out.println(fieldType);

        ParameterizedType listType = (ParameterizedType) field.getGenericType();
        Type elementType = listType.getActualTypeArguments()[0];
        System.out.println(elementType);  // Outputs: class java.lang.String
    }
}
