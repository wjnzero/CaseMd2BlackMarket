package view;

import controller.Admin;
import controller.SurvivalControl;
import model.equipment.Armor;
import model.equipment.Equipment;
import model.equipment.Food;
import model.equipment.Weapon;
import model.user.Survival;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Admin admin = new Admin();
    public static SurvivalControl survivalControl;
    public static java.util.List<Equipment> equipmentList = Admin.equipmentList;
    public static List<Survival> survivalList = Admin.survivalList;

    static int count = 0;
    static String code = "";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        index();
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
            System.out.println("noob, market closed!");
        }


    }
    public static void adminView(){
        Menu.welcomeAdmin();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                clear();
                sleep(0.01);
                adminEquipmentList();
                break;
            case 2:
                clear();
                sleep(0.01);
                adminSurvivalList();
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
    public static void survivalView(){
        Menu.welcomeSurvival();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                clear();
                sleep(0.01);
                survivalBuy();
                break;
            case 2:
                clear();
                sleep(0.01);
                survivalEquipControl();
                break;
            case 9:
                System.out.println("input coin:");
                double coin = scanner.nextDouble();
                survivalControl.buyCoin(coin);
                Admin.setCoin(Admin.getCoin()-coin);
                clear();
                sleep(0.01);
                scanner=new Scanner(System.in);
                survivalView();
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
    public static void survivalEquipControl(){
        Menu.survivalEquipList();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Enter index:");
                int index = scanner.nextInt();
                survivalControl.equipInventory((survivalControl.inventory()).get(index).getType(),(survivalControl.inventory()).get(index));
                survivalControl.removeItem(index);
                System.out.println("Done, return status in 3s");
                scanner = new Scanner(System.in);
                clear();
                sleep(0.01);
                survivalView();
                break;
            case 2:
                System.out.println("Enter index:");
                index = scanner.nextInt();
                survivalControl.removeItem(index);
                scanner = new Scanner(System.in);
                clear();
                sleep(0.01);
                survivalEquipControl();
                break;
            case 3:
                System.out.println("Enter index:");
                int details = scanner.nextInt();
                System.out.println(equipmentList.get(details).toString());
                System.out.println("Press any number to return");
                int key = scanner.nextInt();
                scanner = new Scanner(System.in);
                clear();
                sleep(0.01);
                survivalEquipControl();
                break;
            case 0:
                clear();
                sleep(0.01);
                survivalView();
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }
    }
    public static void survivalBuy(){
        Menu.availableEquipList();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Enter item name:");
                String itemName = scanner.nextLine();
                boolean status=false;
                for (Equipment e:equipmentList
                     ) {
                    if (Objects.equals(e.getName(), itemName)){
                        if (e.getPrice()<survivalControl.currentCoinDouble()){
                            survivalControl.buy(e);
                            survivalControl.setCoin(survivalControl.currentCoinDouble()-e.getPrice());
                            admin.removeEquip(itemName);
                            status=true;
                        }
                        break;
                    }
                }
                if (status){
                    System.out.println("buy success, refresh shop in 2s");
                    sleep(2);
                    clear();
                    sleep(0.01);
                    survivalBuy();
                }
                else {
                    System.out.println("invalid name, buy again in 3s ");
                    sleep(2);
                    clear();
                    sleep(0.01);
                    survivalBuy();
                }
                scanner = new Scanner(System.in);
                break;
            case 2:
                System.out.println("Enter index:");
                int details = scanner.nextInt();
                System.out.println(equipmentList.get(details).toString());
                System.out.println("Press any number to return");
                int number = scanner.nextInt();
                scanner = new Scanner(System.in);
                clear();
                sleep(0.01);
                survivalBuy();
                break;
            case 0:
                clear();
                sleep(0.01);
                survivalView();
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }
    }
    public static void adminEquipmentList(){
        Menu.adminEquipList();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                clear();
                sleep(0.01);
                addE();
                break;
            case 2:
                System.out.println("Index? :");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.print("NewName? :");
                String newName = scanner.nextLine();
                admin.setEquip(index,newName);
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminEquipmentList();
                break;
            case 3:
                System.out.println("Index? :");
                index = scanner.nextInt();
                admin.removeEquip(index);
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminEquipmentList();
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
    public static void adminSurvivalList(){
        Menu.adminSurvivalList();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("survival code:");
                String code = scanner.nextLine();
                System.out.println("coin:");
                double coin = scanner.nextDouble();
                admin.addSurvival(new Survival(code,coin));
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminSurvivalList();
                break;
            case 2:
                System.out.println("Index? :");
                int index = scanner.nextInt();
                admin.removeSurvival(index);
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminSurvivalList();
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
    public static void addE(){
        Menu.addEquip();
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Armor");
                System.out.println("name:");
                String name = scanner.nextLine();
                System.out.println("notes:");
                String notes = scanner.nextLine();
                System.out.println("type:");
                String type = scanner.nextLine();
                System.out.println("price:");
                int price = scanner.nextInt();
                System.out.println("durability:");
                int durability = scanner.nextInt();
                System.out.println("defence:");
                int defence = scanner.nextInt();
                System.out.println("speed:");
                int speed = scanner.nextInt();
                System.out.println("armorRadiation:");
                int armorRadiation = scanner.nextInt();
                admin.addEquip(new Armor(name,notes,type,price,durability,defence,speed,armorRadiation));
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminEquipmentList();
                break;
            case 2:
                System.out.println("Food:");
                System.out.println("name:");
                name = scanner.nextLine();
                System.out.println("notes:");
                notes = scanner.nextLine();
                System.out.println("type:");
                type = scanner.nextLine();
                System.out.println("price:");
                price = scanner.nextInt();
                System.out.println("health:");
                int health = scanner.nextInt();
                System.out.println("hunger:");
                int hunger = scanner.nextInt();
                System.out.println("thirst:");
                int thirst = scanner.nextInt();
                admin.addEquip(new Food(name,notes,type,price,health,hunger,thirst));
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminEquipmentList();
                break;
            case 3:
                System.out.println("Weapon:");
                System.out.println("name:");
                name = scanner.nextLine();
                System.out.println("notes:");
                notes = scanner.nextLine();
                System.out.println("type:");
                type = scanner.nextLine();
                System.out.println("price:");
                price = scanner.nextInt();
                System.out.println("durability:");
                durability = scanner.nextInt();
                System.out.println("damage:");
                double damage = scanner.nextDouble();
                System.out.println("atkSpeed:");
                double atkSpeed = scanner.nextDouble();
                admin.addEquip(new Weapon(name,notes,type,price,durability,damage,atkSpeed));
                clear();
                sleep(0.01);
                scanner = new Scanner(System.in);
                adminEquipmentList();
                break;
            case 0:
                clear();
                sleep(0.01);
                adminEquipmentList();
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }

    }

    private static void checkSurvival() {
        code = scanner.nextLine();
        if (admin.checkSurvival(code)!=null){
            survivalControl = new SurvivalControl(code);
            clear();
            sleep(0.01);
            survivalView();
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
