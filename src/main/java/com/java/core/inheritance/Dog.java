package com.java.core.inheritance;

public class Dog extends Animal {

    public void bark() {
        System.out.println("barking...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping at human's house!");
    }

}
