package com.justintime.ooad.flight;


public class ExtraSpace extends FlightDecorator{

    Flight flight;

    public ExtraSpace(Flight flight){
        this.flight = flight;
    }

    @Override
    public String showFlight() {
        return flight.showFlight() + ", Extra Space";
    }

    @Override
    public double getPrice() {
        return flight.getPrice() + 50;
    }
    
}