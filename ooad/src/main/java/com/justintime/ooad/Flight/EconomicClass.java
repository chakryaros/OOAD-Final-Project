package com.justintime.ooad.flight;
import java.util.ArrayList; 
import java.util.Random;


public class EconomicClass extends Flight{

    public EconomicClass(String descrip) {
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

