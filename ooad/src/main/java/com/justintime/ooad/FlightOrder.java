package com.justintime.ooad;

public class FlightOrder{
    public String description;
    public double payment;

    public FlightOrder(String descrip, double payment){
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