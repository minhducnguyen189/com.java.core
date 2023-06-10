package com.java.core.accessmodifier.samepackage;

public class AccessExample {
    private String privateVariable;       // private access modifier

    String defaultVariable;              // default access modifier

    protected String protectedVariable;  // protected access modifier

    public String publicVariable;        // public access modifier

    public void accessExample() {
        // Access within the class
        privateVariable = "Private variable accessed within the class";
        defaultVariable = "Default variable accessed within the class";
        protectedVariable = "Protected variable accessed within the class";
        publicVariable = "Public variable accessed within the class";

    }
}

