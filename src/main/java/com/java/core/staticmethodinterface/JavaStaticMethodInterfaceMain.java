package com.java.core.staticmethodinterface;


public class JavaStaticMethodInterfaceMain {

    public static void main(String[] args) {
        MyImpl myImpl = new MyImpl();
        myImpl.print("Expect null check from static method interface!");
        myImpl.isNull("Expect null check from MyImpl!");
    }

}
