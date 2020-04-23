package ProblemSolving;

public class BirthdayCncles {
    public static void main(String[] args) {
        int arr[] = {3,2,1,3};
        int Max =0, Count = 0;
        //getMax
        for(int i=0;i<arr.length;i++){
            if (arr[i]  > Max)
                Max = arr[i];
        }
        System.out.println(Max);
        //get counter
        for(int i=0;i<arr.length;i++){
            if (arr[i] == Max)
                Count++;
        }
        System.out.println(Count);
        //successful
    }
}
