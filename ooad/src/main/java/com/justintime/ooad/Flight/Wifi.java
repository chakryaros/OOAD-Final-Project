package com.justintime.ooad.Flight;

public class Wifi extends FlightDecorator{

    Flight flight;

    Wifi(Flight flight){
        this.flight = flight;
    }

    @Override
    public String showFlight() {
        return flight.showFlight() + ", Wifi";
    }

    @Override
    public double getPrice() {
        return flight.getPrice() + 30;
    }
    
}