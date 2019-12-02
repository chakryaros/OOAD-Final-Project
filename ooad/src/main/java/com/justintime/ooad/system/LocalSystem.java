package com.justintime.ooad.system;

import java.util.ArrayList;
import java.util.Observable;

import com.justintime.ooad.room.src.Room;
import com.justintime.ooad.customer.customer;
import com.justintime.ooad.flight.Flight;

public class LocalSystem extends Observable {
    
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private ArrayList<customer> customers = new ArrayList<customer>();
    private String reservationState;


    public LocalSystem(ArrayList<Flight> flights, ArrayList<Room> rooms, ArrayList<customer> customers, customer customer){
        this.flights = flights;
        this.rooms = rooms;
        this.customers = customers;
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

    public void removeRoom(String descrip){
        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).showRoom() == descrip){
                rooms.remove(i);
                break;
            }
        }
    }

    public void removeFlight(String descrip){
        for(int i = 0; i < flights.size(); i++){
            if(flights.get(i).showFlight() == descrip){
                flights.remove(i);
                break;
            }
        }
    }

    public void setReservationState(String state){
        this.reservationState = state;
        setChanged();
        notifyObservers();
    }

    public String getReservationState(){
        return reservationState;
    }

    public void getCustomers(){
        for(int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i).getName() + customers.get(i).getType());
        }
    }

    public void addCsutomers(customer c){
        customers.add(c);
    }

}