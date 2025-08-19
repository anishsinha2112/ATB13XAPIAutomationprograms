package com.Anishsinha.ex_06_TestAssetions;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class APITesting026TestNGAssertion {

    //  @Test
    //  public void test_hardAssertExample(){
    //       System.out.println("Start of the program");
    //       Assert.assertEquals("anish","Anish");
    //       System.out.println("End of the program");

    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Start of Soft Assert test");

        softAssert.assertEquals("anish", "Anish", "❌ First Soft Assert Failed!");
        softAssert.assertTrue(10 > 20, "❌ Second Soft Assert Failed!");
        softAssert.assertNotNull(null, "❌ Third Soft Assert Failed!");

        System.out.println("This line WILL execute even if assertions above fail");

        // IMPORTANT: Collects all failures and reports them at the end
        softAssert.assertAll();
    }
}




