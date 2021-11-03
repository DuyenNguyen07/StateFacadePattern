package com.food;

import com.food.tool.Stove;

public class PhoMaker implements FoodMaker {

    public void cook(Stove stove) {
        prepareIngredients();
        boilPho(stove);
    }

    public void prepareIngredients() {
        System.out.println("Washing beef...");
        System.out.println("Slicing beef...");
        System.out.println("Marinating beef...");
    }

    public void boilPho(Stove stove) {
        System.out.println("Turn on the cooktop...");
        stove.pressPowerButton();   // turn on
        System.out.println("Heating up pot...");
        stove.changeHeatLevel(7);
        System.out.println("Boiling broth, then turn down the heat...");
        stove.changeHeatLevel(3);
        System.out.println("Putting noodle and beef in bowl...");
        System.out.println("Pouring broth into bowl...");
        stove.pressPowerButton();   // turn off
        System.out.println("Pho is ready to serve.");
    }
}
