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
    public static String equipmentName(){
            try {
                String name = null;
                name = Main.equipmentList.get(number).getName()+"("+(Main.equipmentList.get(number).getClass()).getSimpleName()+")";
                if (name.length()<15)
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
