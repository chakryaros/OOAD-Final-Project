package com.justintime.ooad.flight;

public abstract class Flight {
    double price = 0;
    String description = "Unknown Flight";

    public String showFlight(){
        return description;
    }

    public abstract double getPrice();
}