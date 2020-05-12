package Play;

import java.util.Scanner;

public class Cricket {
    public static void StartPlaying(){
        Scanner obj = new Scanner(System.in);
        int i=0,total = 0;
        System.out.println("Welcome to the Cricket game");
        for (;;){
            //data entering part
            System.out.println("enter value:");
            i = obj.nextInt();
            System.out.println("value: "+i);

            //random value generating

            //getting totoal
            total += i;

            //finishing part
            if (i==1){
                break;
            }

        }
        System.out.println("Game finished");
        System.out.println("Your final score is: "+(total-1));
    }
}
