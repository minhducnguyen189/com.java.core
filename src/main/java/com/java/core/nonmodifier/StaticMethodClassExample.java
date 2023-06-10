package com.java.core.nonmodifier;

public class StaticMethodClassExample {

    private String exampleVariable;

    public static int add(int a, int b) { // static method
        //this.exampleVariable = "Example Value";   //Can't access exampleVariable
        return a + b;
    }

}
