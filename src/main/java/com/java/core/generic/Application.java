package com.java.core.generic;

public interface Application<T, S> {

    T getApplication(S appId);

}
