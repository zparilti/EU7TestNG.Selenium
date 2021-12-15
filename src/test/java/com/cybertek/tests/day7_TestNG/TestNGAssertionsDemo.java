package com.cybertek.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @BeforeMethod
    public void setup(){
        System.out.println("Open Browser");
    }
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("title","title");

        System.out.println("Second Assertion");
        Assert.assertEquals("url","url");

        //close
    }
    @Test
    public void test2(){
        Assert.assertEquals("test2","test2");
    }
    @Test
    public void test3(){
        String expecttedTitle = "Cyt";
        String actualTitle ="Cybertek";

        Assert.assertTrue(actualTitle.startsWith(expecttedTitle),"verify title starts with Cyb");
    }
    @Test
    public void  test4(){
        String email = "mike@smith.com";
        Assert.assertTrue(email.contains("@"), "verify email contains @");
    }

    @Test
    public void test5(){
        Assert.assertFalse(0>1, "verify that 0 is not greater than 1");
    }
    @Test
    public void test6(){
        Assert.assertNotEquals("one","one");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Close Browser");
    }

}
