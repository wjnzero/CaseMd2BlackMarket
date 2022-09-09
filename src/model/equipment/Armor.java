package model.equipment;

public class Armor extends Equipment {
    private int defence, speed, armorRadiation;

    public Armor() {
    }
    public Armor(String name, String notes, String type, int price, int durability, int defence, int speed, int armorRadiation) {
        super(name, notes, type, price, durability);
        this.defence = defence;
        this.speed = speed;
        this.armorRadiation = armorRadiation;
    }
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmorRadiation() {
        return armorRadiation;
    }

    public void setArmorRadiation(int armorRadiation) {
        this.armorRadiation = armorRadiation;
    }

    @Override
    public String toString() {
        return "\nArmor{" +
                "name= " + super.getName() +
                ", type= " + super.getType() +
                ", price= " + super.getPrice() +
                ", notes= " + super.getNotes() +
                ", defence=" + defence +
                ", speed=" + speed +
                ", armorRadiation=" + armorRadiation +
                '}';
    }
}
