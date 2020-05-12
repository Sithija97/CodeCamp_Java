package CoupleMatcher;

import java.util.Scanner;

public class GirlData {
    //user input
    Scanner input = new Scanner(System.in);
    int userinput = input.nextInt();

    public static void GirlInpt() {
        Facts facts = new Facts();
        facts.setUserinput(2);
        String x = facts.Selection();
        System.out.printf("girls's selected food is:" + x+"\n");

    }
}
