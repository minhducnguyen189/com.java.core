package com.java.core.abstraction;

public class JavaAbstractionMain {

    public static void main(String[] args) {
        Employee developer = new Developer("Duc", "HCM", "12345");
        System.out.println(developer);
        System.out.println("Base-Salary: " + developer.getBaseSalary());
        System.out.println("Bonus: " + developer.getBonus());
    }

}
