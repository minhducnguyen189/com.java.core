package com.java.core.generic;

public class JavaGeneric {

    public static void main(String[] args) {
        GenericType<String> stringGenericType = new GenericType<>();
        stringGenericType.setT("this is a string");
        System.out.println(stringGenericType.getT().getClass().getSimpleName());

        GenericType<Long> longGenericType = new GenericType<>();
        longGenericType.setT(100L);
        System.out.printf(longGenericType.getT().getClass().getSimpleName());
    }

}
