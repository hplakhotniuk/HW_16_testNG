package com.homework;


import org.testng.annotations.*;

public class TestClassOne {
    @BeforeGroups("pos")
    public void setupPos() {
        System.out.println("Setup Positive tests");
    }

    @AfterGroups("pos")
    public void teardownPos() {
        System.out.println("Teardown Positive tests");
    }

    @AfterGroups("neg")
    public void teardownNeg() {
        System.out.println("Teardown Negative tests");
    }

    @BeforeGroups("neg")
    public void setupNeg() {
        System.out.println("Setup Negative tests");
    }

    @Test(groups = "pos")
    public void adding() {
        System.out.println("adding");
    }

    @Test(groups = "pos")
    public void multiplication() {
        System.out.println("multiplication");
    }

    @Test(groups = "neg")
    public void subtracting() {
        System.out.println("subtracting");
    }

    @Test(groups = "neg")
    public void division() {
        System.out.println("division");
    }

    @Test(groups = "excluded")
    public void excluding() {
        System.out.println("excluding");
    }
}
