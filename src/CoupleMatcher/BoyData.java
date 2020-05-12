package CoupleMatcher;
import java.util.Scanner;

public class BoyData {
    static Facts facts = new Facts();
    //user input
    static Scanner input = new Scanner(System.in);
    public static String BoyInptFood(){
        //input
        System.out.println("boy what's your favourite food?");
        int userinput = input.nextInt();

        facts.setUserinput(userinput);
        String x = facts.SelectionFood();
        System.out.printf("boy's selected food is:"+x+"\n");
        return x;

    }

    public static String BoyInptCountry() {
        //input
        System.out.println("boy what's your favourite country?");
        int userinput = input.nextInt();
        facts.setUserinput(userinput);
        String y = facts.SelectionCountry();
        System.out.printf("boy's selected country is:"+y+"\n");
        return y;
    }

    public static String BoyInptHobby() {
        //input
        System.out.println("boy what's your favourite hobby?");
        int userinput = input.nextInt();
        facts.setUserinput(userinput);
        String y = facts.SelectionHobby();
        System.out.printf("boy's selected hobby is:"+y+"\n");
        return y;
    }

}
