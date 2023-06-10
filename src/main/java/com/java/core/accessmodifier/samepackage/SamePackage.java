package com.java.core.accessmodifier.samepackage;

public class SamePackage {

    public void accessExample() {
        // Access within the package
        AccessExample obj = new AccessExample();
        obj.defaultVariable = "Default variable accessed within the package";
        obj.protectedVariable = "Protected variable accessed within the package";
        obj.publicVariable = "Public variable accessed within the package";
    }

}
