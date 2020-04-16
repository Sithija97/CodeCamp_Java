package Algorithms;

import java.util.Scanner;

public class FindeRepeater {
    public static void RepeatCharFinder() {

        Scanner object = new Scanner(System.in);
        System.out.println("enter a string:\n");
        String name = object.nextLine();
        System.out.println("entered string: "+name);

        //Storing String ina char array
        char nameArr[] = name.toCharArray();

        //printing array
        for(char c: nameArr){
            System.out.print(c+" ");
        }
        System.out.println("\nRepeated characters:");
        //Repetition
        for(int i=0;i<nameArr.length;i++){
            for (int j=i+1;j<nameArr.length;j++){
                if(nameArr[i]==nameArr[j]){
                    System.out.print(nameArr[j]+" ");
                }
            }
        }
    }

    public static void RepeatIntFinder() {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a number:\n");
        int number = object.nextInt();
        System.out.println("entered number: "+number);

        //Storing String ina char array
        int numberArr[] ;

        //printing array

    }
}
