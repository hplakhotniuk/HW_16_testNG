package com.homework;

import org.testng.annotations.Test;

public class TestClassThree {
    @Test(priority = 4)
    public void adding() {
        System.out.println("adding");
    }

    @Test(priority = 3)
    public void division() {
        System.out.println("division");
    }

    @Test(priority = 2)
    public void multiplication() {
        System.out.println("multiplication");
    }

    @Test(priority = 1)
    public void subtracting() {
        System.out.println("subtracting");
    }

}
