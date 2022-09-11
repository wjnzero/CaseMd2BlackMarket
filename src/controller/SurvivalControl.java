package controller;

import model.equipment.Equipment;
import model.user.ISurvivalAction;
import model.user.Survival;

import java.io.Serializable;
import java.util.Objects;

public class SurvivalControl implements Serializable, ISurvivalAction {
    Survival survival ;

    public SurvivalControl(String code) {
        for (Survival sv:Admin.survivalList
             ) {
            if (Objects.equals(sv.getCode(), code))
                this.survival = sv;
        }
    }

    public SurvivalControl() {
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
    public String currentCode(){
        return survival.getCode();
    }
    public String currentCoin(){
        return String.valueOf(survival.getCurrentCoin());
    }
    public String info1(){
        return "health=" + survival.getHealth() +
                " hunger=" + survival.getHunger() +
                " thirst=" + survival.getThirst();
    }
    public String info2(){
        return  "dmg=" + survival.getDmg() +
                " atkSpeed=" + survival.getAtkSpeed() +
                " dps=" + survival.getDps();
    }
    public String slot1(){
        return survival.getSlot().keySet().toString();
    }
    public String slot2(){
        return survival.getSlot().values().toString();
    }
}
