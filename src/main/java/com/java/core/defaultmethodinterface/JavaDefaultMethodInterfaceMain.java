package com.java.core.defaultmethodinterface;

public class JavaDefaultMethodInterfaceMain {

    public static void main(String[] args) {

        FirstInterface firstInterface = new MyImpl();
        SecondInterface secondInterface = new MyImpl();

        firstInterface.firstMethod("first method call");
        firstInterface.log("fistInterface calls");
        System.out.println("------------------------------");
        secondInterface.secondMethod("second method call");
        secondInterface.log("secondInterface calls");
    }

}
