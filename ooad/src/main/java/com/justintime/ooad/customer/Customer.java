package com.justintime.ooad.customer;

import java.util.ArrayList;
import com.justintime.ooad.order.FlightOrder;
import com.justintime.ooad.order.HotelOrder;
import com.justintime.ooad.system.LocalSystem;

public class customer {
    public String name;
    public String email;
    public String type;
    protected LocalSystem system;
    protected ArrayList<HotelOrder> hotelReservation = new ArrayList<HotelOrder>();
    protected ArrayList<FlightOrder> flightReservation = new ArrayList<FlightOrder>();

    public customer(String name, String email, String type, LocalSystem sys){
        this.name = name;
        this.email = email;
        this.type = type;
        this.system = sys;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
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

    public String getType(){
        return type;
    }

    protected ArrayList<HotelOrder> getHotelReservation(){
        return hotelReservation;
    }

    protected ArrayList<FlightOrder> getFlightReservation(){
        return flightReservation;
    }
}