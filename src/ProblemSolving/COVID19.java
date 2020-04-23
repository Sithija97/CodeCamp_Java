package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class COVID19 {
    public static void main(String[] args) {
        //string
        //split and store in an array
        //calculation
        //3 5 3 4 3 6
        //15
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
//        String x = "3 5 3 4 3 6";
        String str[] = x.split(" ");

//        for (int i=0; i< str.length;i++){
//            System.out.println(str[i]);
//        }//just printed str array

        int size = str.length;
        int arr[] = new int [size];

        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(Arrays.toString(arr));

        int tot = 0;
        for (int j=1;j<arr.length;){
            //System.out.println(arr[j]);
            tot += arr[j];
            j=j+2;

        }
        System.out.println(tot);

    }
}
