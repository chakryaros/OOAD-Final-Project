package com.justintime.ooad.Flight;
import java.util.ArrayList; 
import java.util.Random;

public class FirstClass extends Flight{

    FirstClass(String descrip) {
        description = descrip + ", First Class";
    }

    @Override
    public double getPrice() {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(500);
        prices.add(600);

        Random rand = new Random();
        return prices.get(rand.nextInt(prices.size()));
    }
    
}