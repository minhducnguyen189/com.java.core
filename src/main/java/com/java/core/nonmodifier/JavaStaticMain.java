package com.java.core.nonmodifier;

public class JavaStaticMain {

    public static void main(String[] args) {
        System.out.println("countValue is " + StaticVariableClassExample.count);
        StaticVariableClassExample staticVariable = new StaticVariableClassExample();
        System.out.println("countValue is " + StaticVariableClassExample.count);

        System.out.println("Sum of a and b: " + StaticMethodClassExample.add(5,5));
    }
}
