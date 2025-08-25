package com.Anishsinha.ex_07_Payload_managment.Class.Tools.ResponsePojo;

import com.Anishsinha.ex_07_Payload_managment.Class.Tools.requestPojo.Booking;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookingResponse {

    private Integer bookingid;
    private Booking booking;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}