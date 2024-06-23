package com.java.core.defaultmethodinterface;

public interface FirstInterface {

    void firstMethod(String string);

    default void log(String string) {
        System.out.println("FirstInterface default method: " + string);
    }

}
