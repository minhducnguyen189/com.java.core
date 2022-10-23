package com.java.core.nonmodifier;

public class JavaFinalMain {

    public static void main(String[] args) {
        FinalVariableExample finalVariableExample = new FinalVariableExample("Final Parameter value");
        System.out.println(finalVariableExample.getFinalParameter());

        FinalMethodExample finalMethodExample = new FinalMethodExample();
        finalMethodExample.printSomething("printSomething");
        finalMethodExample.printData("printData");

        ExtendFinalMethodExample extendFinalMethodExample = new ExtendFinalMethodExample();
        extendFinalMethodExample.printData("printData");

        FinalClassExample finalClassExample = new FinalClassExample();
        finalClassExample.setExampleParam("final class with example param");
        System.out.println(finalClassExample.getExampleParam());
        finalClassExample.printSomething("something");
    }

}
