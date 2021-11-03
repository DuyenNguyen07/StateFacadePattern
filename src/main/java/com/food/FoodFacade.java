package com.food;

import com.food.tool.Cooker;
import com.food.tool.cooktops.InductionCooktop;

public class FoodFacade {
    private FoodMaker chickenFriedMaker;
    private FoodMaker phoMaker;
    private FoodMaker soupMaker;

    private Cooker cooker;

    public FoodFacade() {
        this.chickenFriedMaker = new ChickenFriedMaker();
        this.phoMaker = new PhoMaker();
        this.soupMaker = new SoupMaker();

        this.cooker = new InductionCooktop();
    }

    public void cookChickenFried(){
        chickenFriedMaker.cook(cooker);
    }

    public void cookPho() {
        phoMaker.cook(cooker);
    }

    public void cookSoup() {
        soupMaker.cook(cooker);
    }
}
