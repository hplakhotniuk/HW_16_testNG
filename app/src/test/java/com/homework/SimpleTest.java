package com.homework;
import org.testng.annotations.*;

public class SimpleTest {
    @BeforeClass
    public void setup() {
        System.out.println("setup");
    }

    @AfterClass
    public void teardown() {
        System.out.println("teardown");
    }

    @Test
    public void oneTest() {
        System.out.println("The one test");
    }
}
