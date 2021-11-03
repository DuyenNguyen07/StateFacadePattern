package com.food.tool.cooktops;

public interface State {
    void pressPowerButton(InductionCooktop cooktop);
    void changeHeatLevel(InductionCooktop cooktop, int heatLevel);
}