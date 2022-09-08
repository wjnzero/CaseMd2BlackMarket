package model.equipment;

import java.io.Serializable;

public abstract class Equipment implements Serializable {
    private String name, notes, type;
    private int price, durability;

    public Equipment() {
    }
    public Equipment(String name, String notes, String type, int price, int durability) {
        this.name = name;
        this.notes = notes;
        this.type = type;
        this.price = price;
        this.durability = durability;
    }

    public Equipment(String name, String notes, String type, int price) {
        this.name = name;
        this.notes = notes;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
