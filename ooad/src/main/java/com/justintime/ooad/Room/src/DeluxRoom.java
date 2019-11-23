package com.justintime.ooad.room.src;

import java.util.ArrayList;
import java.util.Random;

public class DeluxRoom extends Room {

	public DeluxRoom(final String descrip) {
		ArrayList<String> types = new ArrayList<String>();
		types.add("1 King Bed");
		types.add("2 Queen Bed");
		types.add("2 Queen Bed 1 Sofa Bed");

		Random rand = new Random();
		description = descrip + ", " + types.get(rand.nextInt(types.size()));
	}
	
	public double getPrice() {
		if(description.contains("King")){
			return (double)120;
		}
		else if(description.contains("Sofa")){
			return (double)135;
		}
		else{
			return (double)130;
		}
		
	}
	
}
