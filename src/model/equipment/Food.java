package model.equipment;

public class Food extends Equipment{
    int health, hunger, thirst;

    public Food(String name, String notes, String type, int price, int health, int hunger, int thirst) {
        super(name, notes, type, price);
        this.health = health;
        this.hunger = hunger;
        this.thirst = thirst;
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

    @Override
    public String toString() {
        return "\nFood{" +
                "name= " + super.getName() +
                ", type= " + super.getType() +
                ", price= " + super.getPrice() +
                ", notes= " + super.getNotes() +
                ", health= " + health +
                ", hunger= " + hunger +
                ", thirst= " + thirst +
                '}';
    }
}
