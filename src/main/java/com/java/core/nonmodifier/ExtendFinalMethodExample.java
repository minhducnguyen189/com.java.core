package com.java.core.nonmodifier;

public class ExtendFinalMethodExample extends FinalMethodExample {

//    can not override final method of FinalMethodExample. Compile Error
//    @Override
//    public final void printSomething(String something) {
//        System.out.println("printSomething: " + something);
//    }

    @Override
    public void printData(String data) {
        System.out.println("Override printDate: " + data);
    }

}
