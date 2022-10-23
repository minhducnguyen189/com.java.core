package com.java.core.nonmodifier;

public class FinalVariableExample {

    public static final String CONSTANT_VARIABLE = "This is a constant";
    private final String finalParameter;


    public FinalVariableExample(String finalParameter) {
        this.finalParameter = finalParameter;
    }

    public String getFinalParameter() {
        return finalParameter;
    }
}
