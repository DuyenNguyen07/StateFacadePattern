package com.food.tool.cooktops;

public class HeatedState implements State {

    // Singleton pattern
    private static HeatedState instance = new HeatedState();

    private HeatedState() {}

    public static HeatedState getInstance() {
        return instance;
    }

    @Override
    public void pressPowerButton(InductionCooktop cooktop) {
        cooktop.setState(PowerOffState.getInstance());
        cooktop.setHeatLevel(null);
        System.out.println(cooktop + " stop heating, power off.");
    }

    @Override
    public void changeHeatLevel(InductionCooktop cooktop, int heatLevel) {
        cooktop.setHeatLevel(heatLevel);
        System.out.println(cooktop + " heat level set to " + cooktop.getHeatLevel());

        if(cooktop.getHeatLevel() == 0) {
            cooktop.setState(PowerOnState.getInstance());
            System.out.println(cooktop + " stop heating.");
        }
    }
}
