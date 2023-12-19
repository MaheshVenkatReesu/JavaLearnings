package Arrays2;

import java.util.*;

public class Update {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input = sc.nextInt();
        return input;

    }

    public static void update(int A[],int key, int newKey){
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                A[i]=newKey;
                return;
            }
        }
        System.out.println("Key is not found in the array");
    }
    public static void main(String[] args){
        int cap = takeInput("Enter capacity of the Array");

        int A[] = new int[cap];

        for(int i=0;i<cap;i++){
            A[i] = takeInput("Enter the Element at "+i+"index:");
        }

        int key = takeInput("Enter the Key");

        int newKey = takeInput("Enter new Key");
        update(A, key, newKey);
        for(int i=0;i<cap;i++){
            System.out.print(A[i]+" ");
        }

    }
}
