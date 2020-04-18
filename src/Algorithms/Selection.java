package Algorithms;

import java.util.Arrays;

public class Selection {
    public static void SelectionSort(int data[]) {

        for (int i=0;i<data.length-1;i++){
            int min = i; //initialzie the min as value on the 0th index
            for (int j=i+1; j<data.length;j++){
                if (data[j]<data[min]){
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }


        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] data = { 20, 12, 10, 15, 2 };
        System.out.println("unsorted array: "+ Arrays.toString(data));
        SelectionSort(data);
    }
}
