package com.Anishsinha.ex_05_TESTNGEXamples.parallel.Class_level;

import org.testng.annotations.Test;

public class chromeTest {
    @Test
    public void test_chrome(){
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());
    }

}
