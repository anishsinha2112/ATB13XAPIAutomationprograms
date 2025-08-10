package com.Anishsinha.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_DELETE_NONBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_delete_non_bdd(){

        String bookingid = "4132"; // Make sure this booking exists
        String token = "50f5008e3f3ad7c"; // Fresh token from /auth

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.accept(ContentType.JSON);
        r.cookie("token", token); // ✅ Required for DELETE

        // Send DELETE request
        response = r.when().delete();

        vr = response.then().log().all();
        vr.statusCode(201); // ✅ Restful Booker returns 201 for successful deletion
    }
}