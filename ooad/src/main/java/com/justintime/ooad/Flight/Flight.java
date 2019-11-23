package com.justintime.ooad.flight;

public abstract class Flight {
    protected double price = 0;
    protected String description = "Unknown Flight";

    public String showFlight(){
        return description;
    }

    public abstract double getPrice();
}