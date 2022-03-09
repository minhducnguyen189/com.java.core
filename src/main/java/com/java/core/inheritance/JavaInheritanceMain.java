package com.java.core.inheritance;

public class JavaInheritanceMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bulldog");

        System.out.println(dog.getName());
        dog.eat();
        dog.bark();
        dog.sleep();
    }

}
