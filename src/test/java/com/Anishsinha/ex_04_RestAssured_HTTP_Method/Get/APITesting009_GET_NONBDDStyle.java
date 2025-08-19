package com.Anishsinha.ex_04_RestAssured_HTTP_Method.Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_NONBDDStyle {

      RequestSpecification r; // per request - given part
      Response response;
      ValidatableResponse vr;
      String pincode;

      @Test
      public void test_Get_Request(){
          pincode = "490006";

                  //Part 1
           r = RestAssured
                  .given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/" + pincode);

          //Part 2
                 response = this.r.when().log().all().get();
                 // Part 3
                 vr=response.then().log().all();
                 vr.statusCode(200);
      }

      @Test
      public void test_Get_NONBDD_Neagtive(){
          pincode = "490006";

          //Part 1
          r =RestAssured
                  .given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/"+ pincode);

          //Part 2
          response = r.when().log().all().get();
          // Part 3
          vr=response.then().log().all();
          vr.statusCode(200);
      }





}
