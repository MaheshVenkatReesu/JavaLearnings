package Arrays;

import java.util.*;
public class ArraysInMethods {
    public static int[] increment(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+2;
        }
        System.out.print("In method");
        for(int i:arr){
            System.out.print(i+" ");
        }
        return(arr);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int b[] = increment(arr);
        System.out.print("After method");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
