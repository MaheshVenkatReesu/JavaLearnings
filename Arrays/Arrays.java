package Arrays;

import java.util.*;
public class Arrays {
    public static void main(String[] args){
        int arr[] = new int[10];
        // int[] arr1 = new int[10];
        // int []arr2 = new int[10];

        arr[0] = 23;
        arr[5] = 235;
        arr[9] = 23;

        System.out.println(arr[5]);

        int arr1[] = {1,2,3,4,5,6,7,8,9};

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n");
        for(int i: arr1){
            System.out.print(i+" "+"*"+" ");
        }


    }
}
