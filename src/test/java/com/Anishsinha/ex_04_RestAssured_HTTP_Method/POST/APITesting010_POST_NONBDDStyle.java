package com.Anishsinha.ex_04_RestAssured_HTTP_Method.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_POST_NONBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_POST_NONBDDStyle_Create_Token(){


        // URL - https://restful-booker.herokuapp.com/auth
        // PAYLOAD - {
        //    "username" : "admin",
        //    "password" : "password123"
        //}
        // HEADER - Content-Type : application/json
        // Auth? - NA
        // cookie ? - NA
        // Validate - 200 OK
        // Body Response - Token is generated or not.

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";


        System.out.println(" ------Part 1-----");

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();


        System.out.println("-----Part 2-----");
        // Making of HTTP Resquest -> Part 2
        response = r.when().log().all().post();


        System.out.println("------Part3-----");
        // verification part -> part3
        vr = response.then().log().all();
        vr.statusCode(200);








    }





}
