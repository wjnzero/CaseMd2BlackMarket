package model.user;

import model.equipment.Equipment;
import model.equipment.Food;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Survival implements  Serializable, ISurvivalAction {
    private int health=70, hunger=70, thirst=70;
    private double dmg = 6, atkSpeed=1.8,dps=dmg*atkSpeed;
    private String code;
    private double currentCoin;
    private List<Equipment> inventory = new ArrayList<>();
    private Map<String, Equipment> slot = new HashMap<>(5);


    public Survival() {
        slot.put("weapon",null);
        slot.put("head",null);
        slot.put("torso",null);
        slot.put("leg",null);
        slot.put("feet",null);
    }

    public Survival(String code, double currentCoin) {
        slot.put("weapon",null);
        slot.put("head",null);
        slot.put("torso",null);
        slot.put("leg",null);
        slot.put("feet",null);
        this.code = code;
        this.currentCoin = currentCoin;
        inventory.add(new Food("Pack of thuoc lao","vietnamese tabaco","other",100,100,0,0));
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public double getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(double atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    public double getDps() {
        return dps;
    }

    public void setDps(double dps) {
        this.dps = dps;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCurrentCoin() {
        return currentCoin;
    }

    public void setCurrentCoin(double currentCoin) {
        this.currentCoin = currentCoin;
    }

    public List<Equipment> getInventory() {
        return inventory;
    }

    public void setInventory(List<Equipment> inventory) {
        this.inventory = inventory;
    }

    public Map<String, Equipment> getSlot() {
        return slot;
    }

    public void setSlot(Map<String, Equipment> slot) {
        this.slot = slot;
    }

    @Override
    public void buy(Equipment equipment) {
        inventory.add(equipment);
    }

    @Override
    public void buyCoin(double coin) {
        currentCoin +=coin;
    }

    @Override
    public void removeItem(int index) {
        inventory.remove(index);
    }


    @Override
    public void showInventory() {
        System.out.println(inventory);
    }

    @Override
    public void search() {

    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "health=" + health +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", dmg=" + dmg +
                ", atkSpeed=" + atkSpeed +
                ", dps=" + dps +
                '}';
    }
}
