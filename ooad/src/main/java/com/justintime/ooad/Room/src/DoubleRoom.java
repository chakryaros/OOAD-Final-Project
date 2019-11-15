package com.justintime.ooad.Room.src;

public class DoubleRoom extends Room {

	public DoubleRoom(String name, double price, String bedNum) {
		super(name, price, bedNum);	// Invoke superclass constructor
	}
	
	// These may be superfluous.
	public double getPrice() {
		return super.price;
	}

}
