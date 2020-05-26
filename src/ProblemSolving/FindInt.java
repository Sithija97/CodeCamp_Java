package ProblemSolving;

public class FindInt {
    public static void main(String[] args) {
        int arr[] = {1,2,6,4,5,3};
        System.out.println("length :"+arr.length);
        int y =6;
        for(int i=0; i<arr.length; i++){
            if(y==arr[i]){
                System.out.println(y+" is in this array");
                break;
            }
        }
    }
}
