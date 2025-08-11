    package com.Anishsinha.ex_05_TESTNGEXamples;

    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class APITesting018_TestNG_DependsonMethod {

        @Test
        public void serverStartedok(){
            System.out.println("I will run first");
            Assert.assertTrue(true);
        }

        @Test(dependsOnMethods = "serverStartedok" )
        public void test1(){
            System.out.println("method1");
            Assert.assertTrue(true);
        }

        @Test(dependsOnMethods = "serverStartedok")
        public void test2(){
            System.out.println("method2");
            Assert.assertTrue(true);
        }








    }
