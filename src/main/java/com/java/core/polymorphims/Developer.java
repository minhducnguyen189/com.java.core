package com.java.core.polymorphims;

public class Developer extends Employee {

    public Developer(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public double calculateSalary() {
        return this.getSalary() + 100;
    }

}
