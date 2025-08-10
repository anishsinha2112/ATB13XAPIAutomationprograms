package com.Anishsinha.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting011_PUT_NONBDDStyle {

    // PUT
    // token,booking ID - A
    // Public void get_token(){ }

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_put_non_bdd() {

        String bookingid = "4132"; // Ensure this booking exists and belongs to you
        String token = "50f5008e3f3ad7c"; // Must be a valid token from /auth

        String payload = "{\n" +
                "  \"firstname\": \"Amit\",\n" +
                "  \"lastname\": \"Sinha\",\n" +
                "  \"totalprice\": 111,\n" +
                "  \"depositpaid\": true,\n" +
                "  \"bookingdates\": {\n" +
                "    \"checkin\": \"2018-01-01\",\n" +
                "    \"checkout\": \"2019-01-01\"\n" +
                "  },\n" +
                "  \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.accept(ContentType.JSON); // ✅ Important
        r.cookie("token", token);   // ✅ Correct cookie
        r.body(payload).log().all();

        response = r.when().put();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}