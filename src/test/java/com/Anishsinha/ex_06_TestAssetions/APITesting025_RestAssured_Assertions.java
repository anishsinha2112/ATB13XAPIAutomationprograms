package com.Anishsinha.ex_06_TestAssetions;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;



public class APITesting025_RestAssured_Assertions {

      RequestSpecification requestSpecification;
      Response response;
      ValidatableResponse validatableResponse;
      String token;
      Integer bookingID;



    @Test
    public void test_CreateBooking_POST(){
        // Payload
        // given - Setting up the body,Url,Base path,uri
        // When - making the Req
        // then - extraction

        String request_payload = "{\n" +
                "    \"firstname\" : \"Anish\",\n" +
                "    \"lastname\" : \"Sinha\",\n" +
                "    \"totalprice\" : 3000,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-07-24\",\n" +
                "        \"checkout\" : \"2025-07-27\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast,Lunch\"\n" +
                "}";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");


        // header information
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(request_payload).log().all();

        response = requestSpecification.when().log().all().post();


        // Get validate response to perform validation

        validatableResponse= response.then().log().all();


        // Rest Assured.Assertions
        validatableResponse.statusCode(200);

        // Booking ID !=null , firstname == Anish
        // Extract the response body and do it

        System.out.println(response.asString());


        validatableResponse.statusCode(200);
        validatableResponse.body("booking", notNullValue());
        validatableResponse.body("booking.firstname", equalTo("Anish"));








    }




}
