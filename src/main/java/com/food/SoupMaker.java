package com.food;

import com.food.tool.Stove;

public class SoupMaker implements FoodMaker {

    public void cook(Stove stove) {
        prepareIngredients();
        boilSoup(stove);
    }

    public void prepareIngredients() {
        System.out.println("Washing meat and vegetables...");
        System.out.println("Cutting meat and vegetables into pieces...");
        System.out.println("Marinating meat...");
    }

    public void boilSoup(Stove stove) {
        System.out.println("Turn on the cooktop...");
        stove.pressPowerButton();   // turn on
        System.out.println("Put water into the pot & heat it up...");
        stove.changeHeatLevel(5);
        System.out.println("Put the meat in, keep boiling...");
        System.out.println("Adding vegetables into the pot. Wait...");
        stove.pressPowerButton();   // turn off
        System.out.println("Soup is ready to serve.");
    }
}
