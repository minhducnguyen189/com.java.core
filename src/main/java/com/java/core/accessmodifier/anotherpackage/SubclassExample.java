package com.java.core.accessmodifier.anotherpackage;

import com.java.core.accessmodifier.samepackage.AccessExample;

public class SubclassExample extends AccessExample {
    public void accessExample() {
        // Access outside the package by subclass only
        protectedVariable = "Protected variable accessed outside the package by subclass only";
        publicVariable = "Public variable accessed outside the package by subclass only";
    }
}
