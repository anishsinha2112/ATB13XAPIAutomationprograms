package com.Anishsinha.ex_05_TESTNGEXamples;

import org.testng.annotations.*;

public class APITesting015_BeforeTest {


    // PUT Request
    // 1.getToken
    // 2.getBookingID
    // 3.test_PUT ( which will use the above two method)
    // 4. closeAllThing
    @BeforeTest
    public void getToken(){
        System.out.println("Before GET token");
    }
    @BeforeTest
    public void getBookingID(){
        System.out.println("Before GET BOOKING");
    }
    @Test
    public void test_Put(){
        // token and bookingID
        System.out.println("PUT REQUEST");
    }
    @AfterTest
    public void closeAlLThings(){
        System.out.println("Close");
    }

}
