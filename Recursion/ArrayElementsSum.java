package Recursion;

public class ArrayElementsSum {
    public static int calculateSum(int[] arr, int len){
        if(len <= 0){
            return 0;
        } 
        int smallOutput = calculateSum(arr, len-1);
        int output = arr[len-1]+smallOutput;
        return(output);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        System.out.println(calculateSum(arr, len));
    }
}
