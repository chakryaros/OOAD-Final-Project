package com.justintime.ooad.system;

import java.util.ArrayList;
import java.util.Observable;

import com.justintime.ooad.Room.src.Room;
import com.justintime.ooad.flight.Flight;

public class LocalSystem extends Observable {
    
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private String reservationState;

    public LocalSystem(ArrayList<Flight> flights, ArrayList<Room> rooms){
        this.flights = flights;
        this.rooms = rooms;
        this.reservationState = "Unknown Reservation";
    }

    public void addFlight(Flight f){
        flights.add(f);
        System.out.println("A Flight is Added To The System.");
    }

    public void addRoom(Room r){
        rooms.add(r);
        System.out.println("A Room is Added To The System.");
    }

    public void searchFlight(String dep, String des){
        String trip = dep + " -> " + des;
        for(int i = 0; i < flights.size(); i++){
            if(flights.get(i).showFlight().contains(trip)){
                System.out.println(flights.get(i).showFlight());
            }
        }
    }

    public void searchRoom(String RoomName, String bedNum){
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).showRoom().contains(RoomName) && rooms.get(i).showRoom().contains(bedNum)){
                System.out.println(rooms.get(i).showRoom());
            }
        }
    }

    public void setReservationState(String state)){
        this.reservationState = state;
        setChanged();
        notifyObservers();
    }

    public String getReservationState(){
        return reservationState;
    }

}