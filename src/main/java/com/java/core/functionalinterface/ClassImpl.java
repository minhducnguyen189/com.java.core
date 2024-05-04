package com.java.core.functionalinterface;

public class ClassImpl {

    public String execute() {
        Application application = new ApplicationImpl();
        return "ClassImpl: " + application.getApplicationId("15161718");
    }

}
