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
}
