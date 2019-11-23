package com.justintime.ooad.room.src;

public class Snacks extends RoomDecorator {
	Room room;
	
	public Snacks(Room room) {
		this.room = room;
	}
	
	public String showRoom() {
		return room.showRoom() + ", Stocked Mini-Fridge";
	}
	
	public double getPrice() {
		return room.getPrice() + 20;
	}

}
