package controller;

import model.equipment.Equipment;
import model.user.ISurvivalAction;
import model.user.Survival;

import java.io.Serializable;

public class SurvivalControl implements Serializable, ISurvivalAction {
    ISurvivalAction survival ;

    public SurvivalControl(Survival survival) {
        this.survival = survival;
    }
    @Override
    public void buy(Equipment equipment) {
        survival.buy(equipment);
    }

    @Override
    public void buyCoin(double coin) {
        survival.buyCoin(coin);
    }

    @Override
    public void removeItem(int index) {
        survival.removeItem(index);
    }


    @Override
    public void showInventory() {
        survival.showInventory();
    }

    @Override
    public void search() {

    }
}
