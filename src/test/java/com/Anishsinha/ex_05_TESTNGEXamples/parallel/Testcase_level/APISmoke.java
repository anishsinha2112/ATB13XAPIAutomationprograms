package com.Anishsinha.ex_05_TESTNGEXamples.parallel.Testcase_level;

import org.testng.annotations.Test;

public class APISmoke {

    @Test
    public void Test_API_Smoke() {
        System.out.println(Thread.currentThread().getId());
    }
}
