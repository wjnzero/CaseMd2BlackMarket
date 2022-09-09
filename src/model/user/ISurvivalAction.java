package model.user;

import model.equipment.Equipment;

public interface ISurvivalAction {

    void buy(Equipment equipment);

    void buyCoin(double coin);


    void removeItem(int index);

    void showInventory();
    void search();
}
