Homework 16
1. Create Gradle project with testNG support, use 'org.testng:testng:6.14.3'
2. Create a simple test with setup and teardown methods. Each method has to 
        output its name to console
3. Create a test class named 'TestClassOne' with several test groups
   3.1. Create several groups of tests
   3.2. Group precondition and teardown methods, excluding one of them from 
        test execution
4. Create another test class 'TestClassTwo' with 2 parametrised test methods
   4.1. The first method has to accept parameters from testng.xml
   4.2. The second method has to accept parameters from a dataprovider
5. Create third test class named 'TestClassThree' where test methods 
        are executed from the bottom to the top using priorities
