package com.justintime.ooad.room.src;

public class SingleRoom extends Room {

	public SingleRoom(String descrip) {
		description = descrip + ", 1 Twin Bed";
	}
	
	public double getPrice() {
        return (double)100;
	}
}
