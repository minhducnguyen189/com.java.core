package com.java.core.nonmodifier;

public class JavaStaticMain {


    static {
        System.out.println("This static block runs before the main method of JavaStaticMain 1");
    }

    public static void main(String[] args) {
        System.out.println("countValue is " + StaticVariableClassExample.count);
        StaticVariableClassExample staticVariable = new StaticVariableClassExample();
        System.out.println("countValue is " + StaticVariableClassExample.count);

        System.out.println("Sum of a and b: " + StaticMethodClassExample.add(5,5));
        System.out.println("StaticBlockClassExample count Value is: " + StaticBlockClassExample.count);
    }

    static {
        System.out.println("This static block runs before the main method of JavaStaticMain 2");
    }

}
