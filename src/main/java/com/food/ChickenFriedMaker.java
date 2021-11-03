package com.food;

import com.food.tool.Stove;

public class ChickenFriedMaker implements FoodMaker {

    public void cook(Stove stove) {
        prepareIngredients();
        fryChicken(stove);
    }

    public void prepareIngredients() {
        System.out.println("Washing chicken...");
        System.out.println("Cutting chicken into pieces...");
        System.out.println("Marinating chicken...");
    }

    public void fryChicken(Stove stove) {
        System.out.println("Turn on the cooktop...");
        stove.pressPowerButton();   // turn on
        System.out.println("Heating up pan...");
        stove.changeHeatLevel(6);
        System.out.println("Pouring oil...");
        System.out.println("Frying until the chicken is crispy...");
        stove.pressPowerButton();   // turn off

        System.out.println("Chicken fried is ready to serve.");
    }


}
