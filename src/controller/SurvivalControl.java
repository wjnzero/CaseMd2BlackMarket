package controller;

import model.equipment.Equipment;
import model.equipment.Weapon;
import model.user.ISurvivalAction;
import model.user.Survival;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        Admin.readWriteSurvival.writeData(Admin.survivalList);
    }

    @Override
    public void buyCoin(double coin) {
        survival.buyCoin(coin);
        Admin.setCoin(Admin.getCoin()-survival.getCurrentCoin());
        Admin.readWriteSurvival.writeData(Admin.survivalList);
    }

    @Override
    public void removeItem(int index) {
        survival.removeItem(index);
        Admin.readWriteSurvival.writeData(Admin.survivalList);
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
    public double currentCoinDouble(){
        return survival.getCurrentCoin();
    }
    public void setCoin(double coin) {
        survival.setCurrentCoin(survival.getCurrentCoin() - coin);
        Admin.readWriteSurvival.writeData(Admin.survivalList);
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
    public List<Equipment> inventory(){
        return survival.getInventory();
    }
    public void equipInventory(String name, Equipment e){
        Map<String, Equipment> slot = new HashMap<>(5);
        slot.put("weapon",null);
        slot.put("head",null);
        slot.put("torso",null);
        slot.put("leg",null);
        slot.put("feet",null);
        if (e.getClass().getSimpleName().equals("Weapon")){
            slot.put("weapon",e);
            survival.setDmg(((Weapon) e).getDmg());
            survival.setAtkSpeed(((Weapon) e).getAtkSpeed());
        }
        survival.setSlot(slot);
        Admin.readWriteSurvival.writeData(Admin.survivalList);
    }
}
