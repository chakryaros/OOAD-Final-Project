package com.justintime.ooad.Flight;
import java.util.ArrayList; 
import java.util.Random;


public class EconomicClass extends Flight{

    EconomicClass(String descrip) {
        description = descrip + ", Economy Class";
    }

    @Override
    public double getPrice() {
        ArrayList<Integer> prices = new ArrayList<>();
        prices.add(200);
        prices.add(300);

        Random rand = new Random();
        return prices.get(rand.nextInt(prices.size()));
    }
    
}

