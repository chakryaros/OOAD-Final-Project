package com.justintime.ooad.Flight;


public class ExtraMeal extends FlightDecorator{

    Flight flight;

    ExtraMeal(Flight flight){
        this.flight = flight;
    }

    @Override
    public String showFlight() {
        return flight.showFlight() + ", Extra Meal";
    }

    @Override
    public double getPrice() {
        return flight.getPrice() + 10;
    }
    
}