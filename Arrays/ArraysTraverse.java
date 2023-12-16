package Arrays;

import java.util.*;

public class ArraysTraverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<arr.length;i++){
            System.out.println("enter the value of "+i+" index:");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum in array is "+max);
    }
}
