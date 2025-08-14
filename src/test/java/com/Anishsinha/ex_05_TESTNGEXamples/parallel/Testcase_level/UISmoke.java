package com.Anishsinha.ex_05_TESTNGEXamples.parallel.Testcase_level;

import org.testng.annotations.Test;

public class UISmoke {

    @Test
    public void Test_UI_Smoke() {
        System.out.println(Thread.currentThread().getId());
    }
}