package com.justintime.ooad.Room.src;

public class Snacks extends RoomDecorator {
	Room room;
	
	public Snacks(Room room) {
		this.room = room;
	}
	
	public String showRoom() {
		return room.showRoom() + "with stocked mini-fridge";
	}
	
	public double getPrice() {
		return room.getPrice() + 5.99;
	}

}
