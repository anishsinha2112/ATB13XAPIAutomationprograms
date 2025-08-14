package com.Anishsinha.ex_05_TESTNGEXamples.parallel.Testcase_level;

import org.testng.annotations.Test;

public class DBSmoke {

    @Test
    public void Test_DB_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
