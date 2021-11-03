package com.food;

import com.food.tool.Cooker;

public class ChickenFriedMaker implements FoodMaker {

    public void cook(Cooker cooker) {
        prepareIngredients();
        fryChicken(cooker);
    }

    public void prepareIngredients() {
        System.out.println("Washing chicken...");
        System.out.println("Cutting chicken into pieces...");
        System.out.println("Marinating chicken...");
    }

    public void fryChicken(Cooker cooker) {
        System.out.println("Turn on the cooktop...");
        cooker.pressPowerButton();   // turn on
        System.out.println("Heating up pan...");
        cooker.changeHeatLevel(6);
        System.out.println("Pouring oil...");
        System.out.println("Frying until the chicken is crispy...");
        cooker.pressPowerButton();   // turn off

        System.out.println("Chicken fried is ready to serve.");
    }


}
