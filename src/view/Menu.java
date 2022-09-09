package view;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Who?"+"\t\t\t\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[1] I'm Survival"+"\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+">[2] I'm Hung Nguyen"+"\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+">[0] Nothing, I'm leaving now"+"\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   ░│▐   ▀▀░░▄░░▀▀   ▌│░   ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ▀─┘░░░░░░░▐ ▌░░░░░░░└─▀  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ▄░░░▄▄▄▓░░▀ ▀░░▓▄▄▄░░░▄  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║    ▄─┘  ▌░░░░░░░▐  └─▄    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║     ░░▐ ─┬┬┬┬┬┬┬─ ▌░░     ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║    ▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║     ▄░░░└┴┴┴┴┴┴┴┘░░░▄     ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║       ▄░░░░░░░░░░░▄       ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║          ▄▄▄▄▄▄▄          ║\t\t\t\t\t\t\t\t\t\t  ║\n"+
                "╚=====================================================================╝");
        System.out.print("Fill here ▄︻┻═┳一: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                clear();
                sleep(1);
                System.out.println("cc");
                break;
            case 2:
                clear();
                System.out.println("cc");;
                break;
            case 0:
                clear();
                System.exit(0);
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }
    }
    public static void checkingSurvival(){

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
