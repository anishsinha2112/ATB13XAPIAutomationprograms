package com.Anishsinha.ex_05_TESTNGEXamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting019_TestNG_Parmeter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi i am demo");
        System.out.println("You are running this param");


        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start the Firefox");
        }
        if (value.equalsIgnoreCase("Chrome")){
            System.out.println("Start the Chrome");
        }
    }

}
