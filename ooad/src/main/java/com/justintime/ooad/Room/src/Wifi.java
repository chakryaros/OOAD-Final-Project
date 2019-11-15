package com.justintime.ooad.Room.src;

public class Wifi extends RoomDecorator {
	Room room;
	
	public Wifi(Room room) {
		this.room = room;
	}
	
	public String showRoom() {
		return room.showRoom() + "with Wifi";
	}
	
	public double getPrice() {
		return room.getPrice() + 15.99;
	}
}
