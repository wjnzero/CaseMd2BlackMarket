package view;

import controller.Admin;
import model.equipment.Equipment;
import model.user.Survival;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Admin admin = new Admin();
    public static java.util.List<Equipment> equipmentList = Admin.equipmentList;
    public static List<Survival> survivalList = Admin.survivalList;

    static int count = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Equipment equipmentTest = new Weapon("Bow", "Simple ranged fight weapon that helps the shooter not to attract much attention", "ranger", 50, 100, 20,1);
//        Survival survival = new Survival("phongCho",5);
//        admin.addSurvival(survival);
//        admin.addEquip(equipmentTest);
//        System.out.println(equipmentList);
//        System.out.println(survivalList);
//        SurvivalControl survivalControl = new SurvivalControl(survivalList.get(0));
//        System.out.println("https://static.wikia.nocookie.net/last-day-on-earth-survival/images/8/81/Hammer.png/revision/latest?cb=20190105193855");
//        Scanner in = new Scanner(System.in);
//        System.out.println("");
//        Menu.checkingSurvival();
        index();
//        Menu.adminEquipList();
    }
    public static void index() {
        Menu.welcome();
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    clear();
                    sleep(0.01);
                    Menu.checkingSurvival();
                    checkSurvival();
                    break;
                case 2:
                    clear();
                    sleep(0.01);
                    Menu.checkingAdmin();
                    checkAdmin();
                    break;
                case 0:
                    clear();
                    System.exit(0);
                    break;
                default:
                    System.out.println("[❌] Wrong answer !!!");
                    break;
            }
        } catch (Exception e){
            System.out.println("you fill text, market closed!");
        }


    }
    public static void adminView(){
        Menu.welcomeAdmin();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                clear();
                sleep(0.01);
                Menu.adminEquipList();
                adminEquipmentList();
                break;
            case 2:
                clear();
                sleep(0.01);
//                Menu.checkingSurvival();
//                checkSurvival();
                break;
            case 0:
                clear();
                sleep(0.01);
                index();
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }
    }
    public static void adminEquipmentList(){
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                clear();
                sleep(0.01);
                Menu.adminEquipList();
//                checkSurvival();
                break;
            case 2:
                clear();
                sleep(0.01);
//                Menu.checkingSurvival();
//                checkSurvival();
                break;
            case 3:
                clear();
                sleep(0.01);
//                Menu.checkingSurvival();
//                checkSurvival();
                break;
            case 0:
                clear();
                sleep(0.01);
                adminView();
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }
    }

    private static void checkSurvival() {
        String code = scanner.nextLine();
        if (admin.checkSurvival(code)){
            System.out.println("phog");
        }
        else if (Objects.equals(code, "0")){
            clear();
            sleep(0.01);
            index();
        }
        else {
            clear();
            sleep(0.01);
            Menu.checkingAgainSurvival();
            checkSurvival();
        }
    }
    private static void checkAdmin() {
        count++;
        String code = scanner.nextLine();
        if (count==2){
            clear();
            sleep(0.01);
            Menu.block();
            System.exit(0);
        }
        else if (Objects.equals(code, "hung")){
            clear();
            sleep(0.01);
            adminView();
        }
        else if (Objects.equals(code, "0")){
            clear();
            sleep(0.01);
            index();
        }
        else {
            clear();
            sleep(0.01);
            Menu.checkingAgainAdmin();
            checkAdmin();
        }
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

    public static void sleep(double second){
        try {
            Thread.sleep((long) (second * 1000L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }






}
