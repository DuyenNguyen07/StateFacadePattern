package com.food;

import com.food.tool.Cooker;

public class SoupMaker implements FoodMaker {

    public void cook(Cooker cooker) {
        prepareIngredients();
        boilSoup(cooker);
    }

    public void prepareIngredients() {
        System.out.println("Washing meat and vegetables...");
        System.out.println("Cutting meat and vegetables into pieces...");
        System.out.println("Marinating meat...");
    }

    public void boilSoup(Cooker cooker) {
        System.out.println("Turn on the cooktop...");
        cooker.pressPowerButton();   // turn on
        System.out.println("Put water into the pot & heat it up...");
        cooker.changeHeatLevel(5);
        System.out.println("Put the meat in, keep boiling...");
        System.out.println("Adding vegetables into the pot. Wait...");
        cooker.pressPowerButton();   // turn off
        System.out.println("Soup is ready to serve.");
    }
}
