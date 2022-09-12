package view;

import controller.Admin;

public class Menu {
    static int number = 0;

    public static void welcome() {
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Who?"+"\t\t\t\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[1] I'm Survival"+"\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+">[2] I'm Admin"+"\t\t\t\t\t\t  ║\n" +
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
    }
    public static void checkingSurvival(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Enter your code?"+"\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
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
    }
    public static void checkingAdmin(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> What your name?"+"\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
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
    }
    public static void checkingAgainSurvival(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Wrong code, fill again"+"\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
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
    }
    public static void checkingAgainAdmin(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Wrong, fill again"+"\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
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
    }
    public static void addEquip(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Adding..."+"\t\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t"+">[1] Armor"+"\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+">[2] Food"+"\t\t\t\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+">[3] Weapon"+"\t\t\t\t\t\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
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
    }
    public static void welcomeAdmin(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Halo, hung nguyen."+"\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t"+"=> Your coin: "+ Admin.getCoin() +"\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+">[1] Display available Equipment"+"\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+">[2] Display available Survivals"+"\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
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
    }
    public static String validateNameSurvival(){
        String s = Main.survivalControl.currentCode();
        if (Main.survivalControl.currentCode().length()<=5){
            if (Main.survivalControl.currentCode().length()<=3){
                return s+"\t";
            }
            return s+"\t\t";}
        return s;
    }
    public static String validateCoinSurvival(){
        String s = Main.survivalControl.currentCoin();
        if (Main.survivalControl.currentCode().length()<=5)
            return s+"\t";
        return s;
    }
    public static String slotDisplay(){
        String s = Main.survivalControl.slot2();
        if (Main.survivalControl.slot2().length()>=Main.survivalControl.slot2().length())
            return s;
        else return s+"\t";
    }

    public static void welcomeSurvival(){
        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Halo, "+ validateNameSurvival() +"\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t"+"=> Your coin: "+ validateCoinSurvival() +"\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+Main.survivalControl.info1()+"\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+Main.survivalControl.info2()+"\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   ░│▐   ▀▀░░▄░░▀▀   ▌│░   ║\t"+Main.survivalControl.slot1()+"\t  ║\n" +
                "║  ▀─┘░░░░░░░▐ ▌░░░░░░░└─▀  ║\t"+slotDisplay()+"\t  ║\n" +
                "║  ▄░░░▄▄▄▓░░▀ ▀░░▓▄▄▄░░░▄  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║    ▄─┘  ▌░░░░░░░▐  └─▄    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║     ░░▐ ─┬┬┬┬┬┬┬─ ▌░░     ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║    ▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐    ║\t"+">[9] Buy Coin"+"\t\t\t\t\t\t  ║\n" +
                "║     ▄░░░└┴┴┴┴┴┴┴┘░░░▄     ║\t"+">[1] Go to Shop"+"\t\t\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+">[2] Inventory"+"\t\t\t\t\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
                "╚=====================================================================╝");
        System.out.print("Fill here ▄︻┻═┳一: ");
    }
    public static void survivalEquipList(){

        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Halo, "+ validateNameSurvival() +"\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t"+"=> Your coin: "+ validateCoinSurvival() +"\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║   ░│▐   ▀▀░░▄░░▀▀   ▌│░   ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║  ▀─┘░░░░░░░▐ ▌░░░░░░░└─▀  ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║  ▄░░░▄▄▄▓░░▀ ▀░░▓▄▄▄░░░▄  ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║    ▄─┘  ▌░░░░░░░▐  └─▄    ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║     ░░▐ ─┬┬┬┬┬┬┬─ ▌░░     ║\t"+ survivalEquipmentName()+"\t\t\t\t  ║\n" +
                "║    ▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐    ║\t"+">[1] Use"+"\t\t\t\t\t\t\t  ║\n" +
                "║     ▄░░░└┴┴┴┴┴┴┴┘░░░▄     ║\t"+">[2] Remove"+"\t\t\t\t\t\t\t  ║\n" +
                "║       ▄░░░░░░░░░░░▄       ║\t"+">[3] Details"+"\t\t\t\t\t\t  ║\n" +
                "║          ▄▄▄▄▄▄▄          ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
                "╚=====================================================================╝");
        System.out.print("Fill here ▄︻┻═┳一: ");
        number=0;
    }
    public static void adminEquipList(){

        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Halo, hung nguyen."+"\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t"+"Available Equipment: " +"\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║   ░│▐   ▀▀░░▄░░▀▀   ▌│░   ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▀─┘░░░░░░░▐ ▌░░░░░░░└─▀  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▄░░░▄▄▄▓░░▀ ▀░░▓▄▄▄░░░▄  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║    ▄─┘  ▌░░░░░░░▐  └─▄    ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║     ░░▐ ─┬┬┬┬┬┬┬─ ▌░░     ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║    ▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐    ║\t"+">[1] Add"+"\t\t\t\t\t\t\t  ║\n" +
                "║     ▄░░░└┴┴┴┴┴┴┴┘░░░▄     ║\t"+">[2] Set"+"\t\t\t\t\t\t\t  ║\n" +
                "║       ▄░░░░░░░░░░░▄       ║\t"+">[3] Remove"+"\t\t\t\t\t\t\t  ║\n" +
                "║          ▄▄▄▄▄▄▄          ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
                "╚=====================================================================╝");
        System.out.print("Fill here ▄︻┻═┳一: ");
        number=0;
    }
    public static void availableEquipList(){

        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Halo, "+ validateNameSurvival() +"\t\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t"+"=> Your coin: "+ validateCoinSurvival() +"\t\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║   ░│▐   ▀▀░░▄░░▀▀   ▌│░   ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▀─┘░░░░░░░▐ ▌░░░░░░░└─▀  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▄░░░▄▄▄▓░░▀ ▀░░▓▄▄▄░░░▄  ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║    ▄─┘  ▌░░░░░░░▐  └─▄    ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║     ░░▐ ─┬┬┬┬┬┬┬─ ▌░░     ║\t"+ equipmentName()+"\t\t\t\t\t\t  ║\n" +
                "║    ▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║     ▄░░░└┴┴┴┴┴┴┴┘░░░▄     ║\t"+">[1] Buy"+"\t\t\t\t\t\t\t  ║\n" +
                "║       ▄░░░░░░░░░░░▄       ║\t"+">[2] Details"+"\t\t\t\t\t\t  ║\n" +
                "║          ▄▄▄▄▄▄▄          ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
                "╚=====================================================================╝");
        System.out.print("Fill here ▄︻┻═┳一: ");
        number=0;
    }
    public static void adminSurvivalList(){

        System.out.println("╔=====================================================================╗\n"+
                "║       ▀▀▀░░░░░░░▀▀▀       ║\t☠☠☠ŚÚŔVĨVÁĹ ßĹÁČĶ MÁŔĶĔŤ☠☠☠\t  ║\n" +
                "║    ▀░░░░░░░░░░░░░░░░░▀    ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║   │░░░░░░░░░░░░░░░░░░░│   ║\t"+"=> Halo, hung nguyen."+"\t\t\t\t  ║\n" +
                "║  ▌│░░░░░░░░░░░░░░░░░░░│▐  ║\t"+"Available Survival: " +"\t\t\t\t  ║\n" +
                "║  ░└┐░░░░░░░░░░░░░░░░░┌┘░  ║\t\t\t\t\t\t\t\t\t\t  ║\n" +
                "║  ░░└┐░░░░░░░░░░░░░░░┌┘░░  ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║  ░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░  ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▌░│      ▌░░░▐      │░▐  ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║   ░│▐   ▀▀░░▄░░▀▀   ▌│░   ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▀─┘░░░░░░░▐ ▌░░░░░░░└─▀  ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║  ▄░░░▄▄▄▓░░▀ ▀░░▓▄▄▄░░░▄  ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║    ▄─┘  ▌░░░░░░░▐  └─▄    ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║     ░░▐ ─┬┬┬┬┬┬┬─ ▌░░     ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║    ▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐    ║\t"+ survivalName()+"\t\t\t\t\t\t  ║\n" +
                "║     ▄░░░└┴┴┴┴┴┴┴┘░░░▄     ║\t"+">[1] Add"+"\t\t\t\t\t\t\t  ║\n" +
                "║       ▄░░░░░░░░░░░▄       ║\t"+">[2] Remove"+"\t\t\t\t\t\t\t  ║\n" +
                "║          ▄▄▄▄▄▄▄          ║\t"+">[0] Return"+"\t\t\t\t\t\t\t  ║\n" +
                "╚=====================================================================╝");
        System.out.print("Fill here ▄︻┻═┳一: ");
        number=0;
    }
    public static String equipmentName(){
            try {
                String name = null;
                name = Admin.equipmentList.get(number).getName()+"("+(Admin.equipmentList.get(number).getClass()).getSimpleName()+")";
                if (name.length()<=11)
                    name+="\t";
                if (name.length()>=12)
                    name+="";
                number++;
                return name;
            }
            catch (Exception e){
                return "\t\t\t";
            }
    }
    public static String survivalEquipmentName(){
        try {
            String name = null;
            name = Main.survivalControl.inventory().get(number).getName()+"("+(Main.survivalControl.inventory().get(number).getClass()).getSimpleName()+")";
            if (name.length()<5)
                name+="\t\t\t";
            else if (name.length() <= 11)
                name+="\t\t\t";
            else if (name.length() > 15)
                name+="";

            number++;
            return name;
        }
        catch (Exception e){
            return "\t\t\t\t\t";
        }
    }
    public static String survivalName(){
        try {
            String name = null;
            name = Admin.survivalList.get(number).getCode();
            if (name.length()<5)
                name+="\t\t\t";
            else if (name.length()<7)
                name+="\t\t";
            else if (name.length() == 8)
                name+="\t";
            number++;
            return name;
        }
        catch (Exception e){
            return "\t\t\t";
        }
    }

    public static void block(){
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▄▄▄▄░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒▒▒▒▒▒▄██████▒▒▒▒▒▄▄▄█▄▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒▒▒▒▄██▀░░▀██▄▒▒▒▒████████▄▒▒▒▒▒▒\n" +
                "▒▒▒▒▒▒███░░░░░░██▒▒▒▒▒▒█▀▀▀▀▀██▄▄▒▒▒\n" +
                "▒▒▒▒▒▄██▌░░░░░░░██▒▒▒▒▐▌▒▒▒▒▒▒▒▒▀█▄▒\n" +
                "▒▒▒▒▒███░░▐█░█▌░██▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▀▌\n" +
                "▒▒▒▒████░▐█▌░▐█▌██▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▐████░▐░░░░░▌██▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒████░░░▄█░░░██▒▒▐█▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒████░░░██░░██▌▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒████▌░▐█░░███▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒▐████░░▌░███▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒▒▒████░░░███▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▒▒██████▌░████▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒▐████████████▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "▒█████████████▄████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "█████████████████▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "█████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");
//        System.out.print(Main.equipmentList);
    }




}
