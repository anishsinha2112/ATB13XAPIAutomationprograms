package com.Anishsinha.Get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting008_GET_BDDStyle {


    @Test
    public void test_Get_Request(){
        String Pincode = "490006";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);

    }

}
