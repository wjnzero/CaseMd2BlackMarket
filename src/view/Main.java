package view;

import controller.Admin;
import model.equipment.Equipment;
import model.user.Survival;

import java.awt.*;
import java.util.List;

public class Main {
    public static Admin admin = new Admin();
    public static List<Equipment> equipmentList = Admin.equipmentList;
    public static List<Survival> survivalList = Admin.survivalList;
    public static void main(String[] args) throws AWTException {
//        Equipment equipmentTest = new Armor("Sneakers", "Sports shoes with a flat heel", "Feet", 100, 100, 0,1,0);
//        Survival survival = new Survival("phongCho",5);
//        admin.addSurvival(survival);
//        admin.addEquip(equipmentTest);
//        System.out.println(equipmentList);
        System.out.println(survivalList.get(0).toString());
//        System.out.println("https://static.wikia.nocookie.net/last-day-on-earth-survival/images/8/81/Hammer.png/revision/latest?cb=20190105193855");
//        Scanner in = new Scanner(System.in);
//        System.out.println("");
        Menu.welcome();
    }






}
