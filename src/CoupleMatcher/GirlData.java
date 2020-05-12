package CoupleMatcher;

import java.util.Scanner;

public class GirlData {
    static Scanner input = new Scanner(System.in);
    static Facts facts = new Facts();
    public static String GirlInptFood() {
        //user input
        System.out.println("girl what's your favourite food?");
        int userinput = input.nextInt();

        facts.setUserinput(userinput);
        String x = facts.SelectionFood();
        System.out.printf("girls's selected food is:" + x+"\n");
        return x;

    }

    public static String GirlInptCountry() {
        //input
        System.out.println("girl what's your favourite country?");
        int userinput = input.nextInt();
        facts.setUserinput(userinput);
        String y = facts.SelectionCountry();
        System.out.printf("girl's selected country is:"+y+"\n");
        return y;
    }

    public static String GirlInptHobby() {
        //input
        System.out.println("girl what's your favourite hobby?");
        int userinput = input.nextInt();
        facts.setUserinput(userinput);
        String y = facts.SelectionHobby();
        System.out.printf("girl's selected hobby is:"+y+"\n");
        return y;
    }
    public static boolean SelectionLiving() {
        //input
        System.out.println("");
        System.out.println("girls liveing style? (1 for expensive 0 for normal) ");
        int userinput = input.nextInt();
        facts.setUserinput(userinput);
        boolean z = facts.SelectionLiving();
        if (z==true){
            System.out.printf("girl likes an expensive living style\n");
            return true;
        }else {
            System.out.printf("girl likes a normal living style\n");
            return false;
        }

    }
}
