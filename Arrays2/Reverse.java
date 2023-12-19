package Arrays2;

import java.util.Scanner;

public class Reverse {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input = sc.nextInt();
        return input;

    }

    public static void reverse(int A[],int cap){
        int left =0;
        int right = cap;
        int temp;
        while(left<right){
            temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args){
        int cap = takeInput("Enter capacity of the Array");

        int A[] = new int[cap];

        for(int i=0;i<cap;i++){
            A[i] = takeInput("Enter the Element at "+i+"index:");
        }

        reverse(A,cap-1);
        for(int i=0;i<cap;i++){
            System.out.print(A[i]+" ");
        }

    }
    
}
