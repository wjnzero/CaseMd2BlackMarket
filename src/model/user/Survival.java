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
        this.code = code;
        this.currentCoin = currentCoin;
        inventory.add(new Food("Pack of thuoc lao","vietnamese tabaco","other",100,100,0,0));
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
        return "Survival{" +
                "health=" + health +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", dmg=" + dmg +
                ", atkSpeed=" + atkSpeed +
                ", dps=" + dps +
                ", code='" + code + '\'' +
                ", currentCoin=" + currentCoin +
                ", inventory=" + inventory +
                ", slot=" + slot +
                '}';
    }
}
