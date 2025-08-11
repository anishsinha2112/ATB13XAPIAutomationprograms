package com.Anishsinha.ex_05_TESTNGEXamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting017_TestNG_Group {

    // reg -> all the 3 testcase
    // sanity -> sanity run =1
    // smoke -> smoke run =1


     @Test(groups = {"reg","sanity"})
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);

    }
    @Test(groups = {"reg"})
    public void test_regRun() {
         System.out.println("Reg");
         Assert.assertTrue(false);


    }

    @Test(groups = {"reg","smoke"})
    public void test_smokeRun(){
        System.out.println("Somke");
        Assert.assertTrue(false);


    }











}

