package com.Anishsinha.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {
    public static void main(String[] args) {

        // Gherkins Syntax
        // Given() -> Pre Req. - URL,Headers,Auth,Body
        // When() ->HTTP method? - Get/Post/Put/PATCH,DELETE.....
        // Then() -> Validation -> 200 ok, firstname == Anish


        // Full URL - https: //api.zippopotam.us/IN/110058
        // Base URL - https://api.zippopotam.us
        // bath path - /IN/110058

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pincode!");
        String pincode = sc.next();

        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);







    }


}
