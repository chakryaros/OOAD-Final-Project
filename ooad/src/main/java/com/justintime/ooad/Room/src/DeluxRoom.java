package com.justintime.ooad.Room.src;

public class DeluxRoom extends Room {

	public DeluxRoom(final String name, final double price, final String bedNum) {
		super(name, price, bedNum);
	}
	
	// These may be superfluous
	public double getPrice() {
		return super.price;
	}
	
	/*
	public String getName() {
		return super.name;
	}
		
	public int getBedNum() {
		return super.bedNum;
	}
	*/
}
