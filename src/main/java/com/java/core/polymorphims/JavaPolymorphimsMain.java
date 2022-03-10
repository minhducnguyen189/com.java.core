package com.java.core.polymorphims;

public class JavaPolymorphimsMain {

    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.setName("Deer");
        System.out.println(deer.eatVegetables());

        Animal animal = deer;
        System.out.println(animal.getName());

        Vegetarian vegetarian = deer;
        System.out.println(vegetarian.eatVegetables());

        Object object = deer;
        System.out.println(object);

        Employee developer = new Developer("Duc", "12345", 100);
        System.out.println("Duc " + developer.calculateSalary());

        Employee employee = new Developer("Han", "56789", 200);
        System.out.println("Han " + employee.calculateSalary());

        Employee director = new Employee("John", "55555", 100);
        System.out.println("John " + director.getSalary());
    }

}
