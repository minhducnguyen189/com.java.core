package com.java.core.nonmodifier;

public final class FinalClassExample {

    private String exampleParam;

    public void printSomething(String something) {
        System.out.println("FinalClass printSomething: " + something);
    }

    public String getExampleParam() {
        return exampleParam;
    }

    public void setExampleParam(String exampleParam) {
        this.exampleParam = exampleParam;
    }
}
