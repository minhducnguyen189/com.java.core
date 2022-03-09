package com.java.core.abstraction;

public class Developer extends Employee {

    public Developer(String name, String address, String id) {
        super(name, address, id);
    }

    @Override
    protected double getBaseSalary() {
        return 100;
    }

    @Override
    protected double getBonus() {
        return 50;
    }


}
