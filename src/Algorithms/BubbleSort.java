package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void BubbleSort() {
        System.out.println("enter values for the array:");
        Scanner arrSize = new Scanner(System.in);
        System.out.println("enter array size:");
        int arrsize = arrSize.nextInt();

        int arr[] = new int[arrsize];

        for (int y=0;y<arrsize;y++){
            System.out.println("enter value for "+arr[y]+"th place:");
            Scanner value = new Scanner(System.in);
            arr[y] = value.nextInt();
        }

        System.out.println("unsorted array: "+Arrays.toString(arr));

        int temp;

        for(int i=0; i<arrsize; i++){
            for(int j=0; j<arrsize-i-1; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        System.out.println("sorted array: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        BubbleSort();
    }
}
