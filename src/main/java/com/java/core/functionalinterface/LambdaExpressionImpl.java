package com.java.core.functionalinterface;

public class LambdaExpressionImpl {

    public String execute() {
        Application application = (appNumber -> "This is appId: " + appNumber);
        return "LambdaExpressionImpl: " + application.getApplicationId("56789");
    }

}
