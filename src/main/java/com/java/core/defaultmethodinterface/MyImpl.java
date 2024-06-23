package com.java.core.defaultmethodinterface;

public class MyImpl implements FirstInterface, SecondInterface {

    @Override
    public void firstMethod(String string) {
        System.out.println("MyImpl firstMethod logging: " + string);
    }

    @Override
    public void secondMethod(String string) {
        System.out.println("MyImpl secondMethod logging: " + string);
    }

    @Override
    public void log(String string) {
        FirstInterface.super.log(string);
        SecondInterface.super.log(string);
        System.out.println("MyImpl logging: " + string);
    }

}
