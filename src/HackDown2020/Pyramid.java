package HackDown2020;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int i, j;
        int n ;

        Scanner obj = new Scanner(System.in);
        System.out.println("enter maximum width:");
        n = obj.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
