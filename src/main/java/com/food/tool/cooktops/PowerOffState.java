package com.food.tool.cooktops;

public class PowerOffState implements State {

    // Singleton pattern
    private static PowerOffState instance = new PowerOffState();

    private PowerOffState() {}

    public static PowerOffState getInstance() {
        return instance;
    }

    @Override
    public void pressPowerButton(InductionCooktop cooktop) {
        cooktop.setState(PowerOnState.getInstance());
        cooktop.setHeatLevel(0);
        System.out.println(cooktop + " power on, heat level = 0");
    }

    @Override
    public void changeHeatLevel(InductionCooktop cooktop, int heatLevel) {
        System.out.println(cooktop + " in mode off, cannot change heat.");
    }
}
