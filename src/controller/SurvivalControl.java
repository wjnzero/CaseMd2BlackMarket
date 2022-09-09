package controller;

import model.user.Survival;

import java.io.Serializable;

public class SurvivalControl implements Serializable {
    Survival survival;

    public SurvivalControl(Survival survival) {
        this.survival = survival;
    }
}
