package com.java.core.functionalinterface;


public class AnonymousImpl {

    public String execute() {
        Application application = new Application() {
            @Override
            public String getApplicationId(String appNumber) {
                return "This is appId: " + appNumber;
            }
        };
        return "AnonymousImpl: " + application.getApplicationId("12345");
    }

}
