package com.Anishsinha.ex_02_RA_concepet;

public class APITesting_Lab04_Bulderpettern {

    public APITesting_Lab04_Bulderpettern step1(){
        System.out.println("Step 1");
        return this;
    }

    public APITesting_Lab04_Bulderpettern step2(){
        System.out.println("Step 2");
        return this;

    }

    public APITesting_Lab04_Bulderpettern step3(String anish1){
        System.out.println("Step 3");
        return this;
    }


    public static void main(String[] args) {
        APITesting_Lab04_Bulderpettern bp = new APITesting_Lab04_Bulderpettern();
                bp.step1().step2().step3("Anish");
    }


}
