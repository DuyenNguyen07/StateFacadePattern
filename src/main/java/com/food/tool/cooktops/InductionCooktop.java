package com.food.tool.cooktops;

import com.food.tool.Stove;

public class InductionCooktop extends Stove {
    public static Integer MAX_HEAT = 8;

    private Integer CURRENT_HEAT_LEVEL;
    private State state;

    public InductionCooktop() {
        CURRENT_HEAT_LEVEL = null;
        state = PowerOffState.getInstance();
    }

    public void pressPowerButton() {
        state.pressPowerButton(this);
    }

    public void changeHeatLevel(int heatLevel) {
        state.changeHeatLevel(this, heatLevel);
    }

    public void setState(State state) {
        this.state = state;
    }

    protected void setHeatLevel(Integer heatLevel) {
        CURRENT_HEAT_LEVEL = heatLevel;
        if(CURRENT_HEAT_LEVEL != null) {
            if (CURRENT_HEAT_LEVEL > MAX_HEAT) {
                CURRENT_HEAT_LEVEL = MAX_HEAT;
            }
            if (CURRENT_HEAT_LEVEL < 0) {
                CURRENT_HEAT_LEVEL = 0;
            }
        }
    }

    public Integer getHeatLevel() {
        return CURRENT_HEAT_LEVEL;
    }

    @Override
    public String toString() {
        return "Induction cooktop:";
    }
}
