package com.Anishsinha.ex_06_TestAssetions;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class APITesting027_RestAssured_TestNG_AssertJ_Assertion {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token;
    Integer bookingID;

    @Test
    public void test_CreateBooking_POST() {
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

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
     // Rest Assared -> import org.hamcrest.matcher %4-%6
        // Matchers.equalto()


        validatableResponse.body("bookingid", Matchers.notNullValue());
        validatableResponse.body("booking.firstname",Matchers.equalTo("Anish"));

    //  TestNG - Extract the details of the firstname, bookingID, lastname from Response.



        //  Extraction (TestNG or Assertj) Is IMP
        bookingID = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        // Testing Assertions - 75%
        // softAssert vs HardAssert (95%)
        // This means that if any assertion fails
        // the remaining statement in that test method will not be executed.

        Assert.assertEquals(firstname, "Anish");
        Assert.assertEquals(lastname,"Sinha");
        Assert.assertNotNull(bookingID);

        if (!firstname.contains("Anish")){
            Assert.fail("Failed kar diya Test");
        }


        // AssertJ(3rd - Lib to assertions) - 20%

        assertThat(bookingID).isNotZero().isNotNull().isPositive();
        assertThat(firstname).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Anish");

      //  assertThat(deposit).isTure();




    }

}
