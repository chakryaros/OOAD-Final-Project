package com.justintime.ooad.room.src;

public class Wifi extends RoomDecorator {
	Room room;
	
	public Wifi(Room room) {
		this.room = room;
	}
	
	public String showRoom() {
		return room.showRoom() + ", Wifi";
	}
	
	public double getPrice() {
		return room.getPrice() + 15.99;
	}
}
