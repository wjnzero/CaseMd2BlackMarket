package view;

import controller.Admin;
import model.equipment.Equipment;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Main {
    public static Admin admin = new Admin();
    public static List<Equipment> equipmentList = Admin.equipmentList;
    public static void main(String[] args) throws AWTException {
//        Equipment equipmentTest = new Armor("Sneakers", "Sports shoes with a flat heel", "Feet", 100, 100, 0,1,0);
//        admin.addEquip(equipmentTest);
//        System.out.println(equipmentList);
//        System.out.println("https://static.wikia.nocookie.net/last-day-on-earth-survival/images/8/81/Hammer.png/revision/latest?cb=20190105193855");
//        Scanner in = new Scanner(System.in);
//        System.out.println("");
        Menu.welcome();
        sleep(2);
        clear();
        sleep(2);
        System.out.println("phongngu");
        System.out.println("phongngu");
        System.out.println("phongngu");
        System.out.println("phongngu");
        System.out.println("phongngu");
    }



    public static void clear(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_NUMPAD1);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_NUMPAD1);
        } catch (AWTException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void sleep(int second){
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
