package com.Anishsinha.ex_03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {

    String pincode;


    @Test
    // valid pincode -> 110001
    public void test_tc1_pincode_valid() {
        pincode = "110048";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }

    @Test
    //#,$,%,@ - any special input = pincode
    public void test_tc2_pincode_valid() {

        pincode = "@";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }

    @Test
    //  ' '
    public void test_tc3_pincode_valid() {

        pincode = " ";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);


    }
}