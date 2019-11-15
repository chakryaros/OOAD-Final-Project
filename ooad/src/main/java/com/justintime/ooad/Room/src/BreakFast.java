package com.justintime.ooad.Room.src;

public class BreakFast extends RoomDecorator {
	Room room;
	
	public BreakFast(Room room) {
		this.room = room;
	}
	
	public String showRoom() {
		return room.showRoom() + " with Breakfast";
	}
	
	public double getPrice() {
		return room.getPrice() + 7.99;
	}

}
