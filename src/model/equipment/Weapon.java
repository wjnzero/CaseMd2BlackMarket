package model.equipment;

public class Weapon extends Equipment {
    private double dmg, atkSpeed,dps;

    public Weapon(String name, String notes, String type, int price, int durability, double dmg, double atkSpeed) {
        super(name, notes, type, price, durability);
        this.dmg = dmg;
        this.atkSpeed = atkSpeed;
    }

    public double getDps() {
        return dmg*atkSpeed;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(float dmg) {
        this.dmg = dmg;
    }

    public double getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(float atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    @Override
    public String toString() {
        return "\nWeapon{" +
                "name= " + super.getName() +
                ", type= " + super.getType() +
                ", price= " + super.getPrice() +
                ", notes= " + super.getNotes() +
                ", dmg=" + dmg +
                ", atkSpeed=" + atkSpeed +
                ", dps=" + getDps() +
                '}';
    }

}
