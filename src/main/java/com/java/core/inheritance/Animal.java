package com.java.core.inheritance;

public class Animal {

    private String name;

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping at forest!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
