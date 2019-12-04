package com.justintime.ooad;

public class HotelOrder{
    public String description;
    public double payment;

    public HotelOrder(String descrip, double payment){
        this.description = descrip;
        this.payment = payment;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPayment(){
        return this.payment;
    }
}