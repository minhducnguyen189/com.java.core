package com.java.core.polymorphims;

public class Deer extends Animal implements Vegetarian {

    @Override
    public String eatVegetables() {
        return this.getName() + " eating grass!";
    }

}
