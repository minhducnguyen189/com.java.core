package com.java.core.nonmodifier;

public class StaticMethodClassExample {

    private String exampleVariable;
    private static String staticExampleVariable;

    public static int add(int a, int b) { // static method
        //this.exampleVariable = "Example Value";   //Can't access exampleVariable
        staticExampleVariable = "Example Static Value";
        System.out.println(staticExampleVariable);
        return a + b;
    }

}
