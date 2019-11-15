package com.justintime.ooad.Flight;


public class SeatSelection extends FlightDecorator{

    Flight flight;

    SeatSelection(Flight flight){
        this.flight = flight;
    }

    @Override
    public String showFlight() {
        return flight.showFlight() + ", Seat Selection";
    }

    @Override
    public double getPrice() {
        return flight.getPrice() + 10;
    }
    
}