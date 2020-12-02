package com.baoge;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Test.class;

        Method method = clazz.getDeclaredMethod("main", String[].class);

        method.invoke(null, new Object[] {null});
    }
}
