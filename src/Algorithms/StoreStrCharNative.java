package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class StoreStrCharNative {

    public static String gettingString() {
        System.out.println("enter a text:");
        Scanner getter = new Scanner(System.in);
        String text = getter.nextLine();
        return text;
    }

    public static void StoreStrArr() {
        String x = gettingString();
        System.out.println("entered text: " + x);
        System.out.println("lenghth of the text: " + x.length());

        //created an array
        char array[] = new char[x.length()];

        //Copy character by character into array
        for (int i = 0; i < x.length(); i++) {
            array[i] = x.charAt(i); //logic
        }

        //display array
        System.out.println(Arrays.toString(array));


    }

    public static void main(String[] args) {
        StoreStrArr();
    }
}
