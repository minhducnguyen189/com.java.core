package com.java.core.abstraction;

public abstract class Employee {

    private String name;
    private String address;
    private String id;

    public Employee(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    protected abstract double getBaseSalary();
    protected abstract double getBonus();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
