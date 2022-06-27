package com.homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {
    @DataProvider(name = "provider")
    public Object[][] createdData1() {
            return new Object[][] {
                    {"+1", "positive"},
                    {"-1", "negative"},
                    {"0", "zero"},
            };
    }

    @Parameters({"num", "def"})
    @Test
    public void dataXML(String num, String def){
        System.out.println("Data is " + num);
        System.out.println("Def is " + def);
    }
    @Test(dataProvider = "provider")
    public void testDataProvider(String num, String numbers){
        System.out.println("Num: " + num + " is " + numbers);
    }

}
