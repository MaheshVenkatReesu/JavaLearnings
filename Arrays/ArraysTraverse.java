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

        int A[] = {1,2,3,4,5,6,7};
        int B[] = A;
        // Here values are not copying instead memory reference is copying so when you change B A also changes
        // In [I@5b480cf9 [ means one dimensional array, I means integer array,
        B[5] = 989;
        System.out.print(A);
        for(int i: A){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i: B){
            System.out.print(i+" ");
        }
    }
}
