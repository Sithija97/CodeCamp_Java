package ProblemSolving;

import java.util.Scanner;

public class NewPattern {

    static int fact(int num) {
        int factorial;

        for(factorial = 1; num > 1; num--){
            factorial *= num;
        }
        return factorial;
    }
    static int ncr(int n,int r) {
        return fact(n) / ( fact(n-r) * fact(r) );
    }
    public static void main(String args[]){
        int  rows =5,i, j;

        //getting number of rows from user
//        System.out.println("Enter number of rows:");
//        Scanner scanner = new Scanner(System.in);
//        rows = scanner.nextInt();
//        scanner.close();

        System.out.println("s");
        for(i = rows-1; i > -1; i--) {
            for(j = rows-i; j >0; j--){
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(" "+ncr(i, j));
            }
            System.out.println();
        }
    }
}