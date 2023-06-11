package com.java.core.nonmodifier;

public class StaticBlockClassExample {

    static int count;

    static {
        count = 10; // initializing static variable in static block
        System.out.println("count Value is: " + count);
    }

}
