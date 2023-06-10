package com.java.core.accessmodifier.anotherpackage;

import com.java.core.accessmodifier.samepackage.AccessExample;

public class OutsidePackageExample {
    public void accessExample() {
        // Access outside the package
        AccessExample obj = new AccessExample();
        obj.publicVariable = "Public variable accessed outside the package";
    }
}
