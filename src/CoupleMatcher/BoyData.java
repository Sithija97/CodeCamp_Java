package CoupleMatcher;
import java.util.Scanner;

public class BoyData {
    //user input
    Scanner input = new Scanner(System.in);
    int userinput = input.nextInt();

    public static void BoyInpt(){
        Facts facts = new Facts();
        facts.setUserinput(2);
        String x = facts.Selection();
        System.out.printf("boy's selected food is:"+x+"\n");

    }

}
