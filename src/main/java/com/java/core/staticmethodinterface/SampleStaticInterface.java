package com.java.core.staticmethodinterface;

public interface SampleStaticInterface {

    default void print(String string) {
        if(!isNull(string)) {
            System.out.println("SampleStaticInterface print: " + string);
        }
    }

    static boolean isNull(String str) {
        System.out.println("SampleStaticInterface null check");
        return str == null || ("".equals(str));
    }

}
