package CoupleMatcher;

import java.util.Scanner;

public class GirlData {


    public static String GirlInpt() {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("girl what's your favourite food?");
        int userinput = input.nextInt();

        Facts facts = new Facts();
        facts.setUserinput(userinput);
        String x = facts.Selection();
        System.out.printf("girls's selected food is:" + x+"\n");
        return x;

    }
}
