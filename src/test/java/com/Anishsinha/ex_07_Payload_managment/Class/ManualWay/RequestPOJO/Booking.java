package com.Anishsinha.ex_07_Payload_managment.Class.ManualWay.RequestPOJO;

public class Booking {

    private String Fisrtname ;
    private String lastname ;
    private Integer totalprice ;
    private Boolean depositpaid;
    private String additionalneed ;

    public String getFisrtname() {
        return Fisrtname;
    }

    public void setFisrtname(String fisrtname) {
        Fisrtname = fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneed() {
        return additionalneed;
    }

    public void setAdditionalneed(String additionalneed) {
        this.additionalneed = additionalneed;
    }
}
