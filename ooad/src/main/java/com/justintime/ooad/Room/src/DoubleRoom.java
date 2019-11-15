package com.justintime.ooad.room.src;

import java.util.ArrayList;
import java.util.Random;

public class DoubleRoom extends Room {

	public DoubleRoom(String descrip) {
		ArrayList<String> roomKind = new ArrayList<String>();
		roomKind.add("2 Twin Beds");
		roomKind.add("1 Queen Bed");

		Random rand = new Random();
		description = descrip + ", " + roomKind.get(rand.nextInt(roomKind.size()));
	}
	
	// These may be superfluous.
	public double getPrice() {
		return (double)115;
	}

}
