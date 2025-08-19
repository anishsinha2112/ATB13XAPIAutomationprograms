package com.Anishsinha.ex_04_RestAssured_HTTP_Method.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_PATCH_NONBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_patch_non_bdd(){

        String bookingid = "4132"; // Make sure this booking exists
        String token = "50f5008e3f3ad7c"; // Fresh token from /auth

        // Partial update payload
        String payload = "{\n" +
                "  \"firstname\": \"UpdatedName\",\n" +
                "  \"lastname\": \"OnlyLastnameUpdated\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.accept(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload).log().all();

        // Send PATCH request
        response = r.when().patch();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
