package com.Anishsinha.ex_02_RA_concepet;


public class APITesting_Lab05_Multiple_TestCase {
    public static void main(String[] args) {
        String pincode = "110046";

        io.restassured.RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200); // Example usage

        pincode = "@";

        io.restassured.RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200); // Example usage


        pincode = " ";

        io.restassured.RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200); // Example usage



    }
}








