package com.Anishsinha.ex_05_TESTNGEXamples.parallel.Method_level;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void validLogin(){
        System.out.println("ValidLogin-Thread"+Thread.currentThread().getId());

    }

    @Test
    public void invalidLogin(){
        System.out.println("invalidlogin-Thread"+ Thread.currentThread().getId());
    }




}
