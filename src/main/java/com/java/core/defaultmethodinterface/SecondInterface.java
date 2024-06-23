package com.java.core.defaultmethodinterface;

public interface SecondInterface {

    void secondMethod(String string);

    default void log(String string) {
        System.out.println("SecondInterface default method: " + string);
    }

}
