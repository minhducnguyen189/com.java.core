package com.java.core.staticmethodinterface;

public class MyImpl implements SampleStaticInterface {

    public boolean isNull(String str) {
        System.out.println("MyImpl null check: " + str);
        return str == null;
    }

}
