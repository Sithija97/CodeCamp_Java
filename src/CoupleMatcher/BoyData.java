package CoupleMatcher;
import java.util.Scanner;

public class BoyData {

    public static String BoyInpt(){
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("boy what's your favourite food?");
        int userinput = input.nextInt();

        Facts facts = new Facts();
        facts.setUserinput(userinput);
        String x = facts.Selection();
        System.out.printf("boy's selected food is:"+x+"\n");
        return x;

    }

}
