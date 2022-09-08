package view;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Who?"+"\t\t\t\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
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
                System.out.println("cc");
                break;
            case 2:
                System.out.println("cc");;
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("[❌] Wrong answer !!!");
                break;
        }
    }
}
