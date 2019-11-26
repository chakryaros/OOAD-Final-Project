package com.justintime.ooad.customer;
import java.util.ArrayList; 
import com.justintime.ooad.system.LocalSystem;

public class Customer {
    public String name;
    public String email;
    public String type;
    protected LocalSystem system;
    protected ArrayList<HotelOrder> hotelReservation = new ArrayList<HotelOrder>();
    protected ArrayList<FlightOrder> flightReservation = new ArrayList<FlightOrder>();

    public Customer(String name, String email, String type, LocalSystem sys){
        this.name = name;
        this.email = email;
        this.type = type;
        this.system = sys;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void addHotelReservation(HotelOrder h){
        hotelReservation.add(h);
        system.setReservationState(h.description);
        system.removeRoom(h.description);
    }

    public void addFlightReservation(FlightOrder f){
        flightReservation.add(f);
        system.setReservationState(f.description);
        system.removeFlight(f.description);
    }

    protected ArrayList<HotelOrder> getHotelReservation(){
        return hotelReservation;
    }

    protected ArrayList<FlightOrder> getFlightReservation(){
        return flightReservation;
    }
}