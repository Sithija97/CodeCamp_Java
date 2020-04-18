package Algorithms;

public class MinMax {
    public static int getMin(int[] arr) {
        int Min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (Min>arr[i]){
                Min = arr[i];
            }
        }
        return Min;
    }

    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (Max<arr[i]){
                Max = arr[i];
            }
        }
        for (int i=1;i<arr.length;i++){

        }
        return Max;
    }

    public static void main(String[] args) {
        int arr[] = {10, 11, 88, 2, 12, 120};
        int max = getMax(arr);
        System.out.println("Max: "+max);
        int min = getMin(arr);
        System.out.println("Min: "+min);

    }
}
