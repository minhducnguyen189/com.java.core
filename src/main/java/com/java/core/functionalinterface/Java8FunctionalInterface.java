package com.java.core.functionalinterface;

public class Java8FunctionalInterface {

    public static void main(String[] args) {
        AnonymousImpl anonymous = new AnonymousImpl();
        System.out.println(anonymous.execute());

        LambdaExpressionImpl lambdaExpression = new LambdaExpressionImpl();
        System.out.println(lambdaExpression.execute());

        MethodReferenceImpl methodReference = new MethodReferenceImpl();
        System.out.println(methodReference.execute());

        ClassImpl classImpl = new ClassImpl();
        System.out.println(classImpl.execute());
    }

}

