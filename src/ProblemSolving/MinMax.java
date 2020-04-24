package ProblemSolving;

public class MinMax {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {7, 69, 2, 221, 8974};
        int size = arr.length;
        int Min =0, Max =0;
        //min
        for (int i=0; i<size-1;i++){
            Min += arr[i];
        }

        //max
        for (int i=1; i<size;i++){
            Max += arr[i];
        }
        System.out.println(Min+" "+Max);
    }
}
