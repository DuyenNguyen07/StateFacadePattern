package com.food;

import com.food.tool.Cooker;

public class PhoMaker implements FoodMaker {

    public void cook(Cooker cooker) {
        prepareIngredients();
        boilPho(cooker);
    }

    public void prepareIngredients() {
        System.out.println("Washing beef...");
        System.out.println("Slicing beef...");
        System.out.println("Marinating beef...");
    }

    public void boilPho(Cooker cooker) {
        System.out.println("Turn on the cooktop...");
        cooker.pressPowerButton();   // turn on
        System.out.println("Heating up pot...");
        cooker.changeHeatLevel(7);
        System.out.println("Boiling broth, then turn down the heat...");
        cooker.changeHeatLevel(3);
        System.out.println("Putting noodle and beef in bowl...");
        System.out.println("Pouring broth into bowl...");
        cooker.pressPowerButton();   // turn off
        System.out.println("Pho is ready to serve.");
    }
}
