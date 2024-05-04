package com.java.core.functionalinterface;

public class ApplicationImpl implements Application {

    @Override
    public String getApplicationId(String appNumber) {
        return "This is appId: " + appNumber;
    }

}
