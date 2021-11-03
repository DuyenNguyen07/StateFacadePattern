package com.food;

import com.food.tool.Stove;
import com.food.tool.cooktops.InductionCooktop;

public class FoodFacade {
    private FoodMaker chickenFriedMaker;
    private FoodMaker phoMaker;
    private FoodMaker soupMaker;

    private Stove stove;

    public FoodFacade() {
        this.chickenFriedMaker = new ChickenFriedMaker();
        this.phoMaker = new PhoMaker();
        this.soupMaker = new SoupMaker();

        this.stove = new InductionCooktop();
    }

    public void cookChickenFried(){
        chickenFriedMaker.cook(stove);
    }

    public void cookPho() {
        phoMaker.cook(stove);
    }

    public void cookSoup() {
        soupMaker.cook(stove);
    }
}
