package com.java.core.functionalinterface;

public class MethodReferenceImpl {

    public String execute() {
        Application application = MethodReferenceImpl::getApplicationId;
        return "MethodReferenceImpl: " + application.getApplicationId("10111213");
    }

    public static String getApplicationId(String appNumber) {
        return "This is appId: " + appNumber;
    }

}
