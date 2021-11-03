package com.food.tool.cooktops;

public class PowerOnState implements State {

    // Singleton pattern
    private static PowerOnState instance = new PowerOnState();

    private PowerOnState() {}

    public static PowerOnState getInstance() {
        return instance;
    }

    @Override
    public void pressPowerButton(InductionCooktop cooktop) {
        cooktop.setState(PowerOffState.getInstance());
        cooktop.setHeatLevel(null);
        System.out.println(cooktop + " power off.");
    }

    @Override
    public void changeHeatLevel(InductionCooktop cooktop, int heatLevel) {
        cooktop.setHeatLevel(heatLevel);
        System.out.println(cooktop + " heat level set to " + cooktop.getHeatLevel());

        if(cooktop.getHeatLevel() > 0) {
            cooktop.setState(HeatedState.getInstance());
            System.out.println(cooktop + " start heating.");
        }
    }
}
