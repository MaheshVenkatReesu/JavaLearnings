package Arrays2;

import java.util.Scanner;

public class Rotate {
    public static int takeInput(String str){
        Scanner sc = new Scanner(System.in);
        System.out.print(str);

        int input = sc.nextInt();
        return input;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // int cap = takeInput("Enter capacity of the Array");
        // int size = takeInput("Enter the size of the Array");

        // int A[] = new int[cap];

        // for(int i=0;i<size;i++){
        //     A[i] = takeInput("Enter the Element at "+i+"index:");
        // }

        System.out.print("Enter '1' to rotate Right and '0' to rotate Left: ");

        int dir = sc.nextInt();

        System.out.print("Enter number of Rotations: ");
        int x = sc.nextInt();

        // if we use new array B then 
        // For right rotation B[(i+x)%(length of array)] = A[i], where x is number of rotations
        // For left rotation B[(i-x+length of array)%(length of array)] = A[i]

        int A[] = {1,2,3,4,5,6,7,8};
        int len = A.length;
        int B[] = new int[len];

        sc.close();

        if(dir == 1){
            for(int i=0;i<len;i++){
                B[(i+x)%len] = A[i];
            }
        }
        else{
            for(int i=0;i<len;i++){
                B[(i-x+len)%len] = A[i];
            }
        }

        for(int i:B){
            System.out.print(i+" ");
        }

        // Without using new array method
        //Right Rotation: First reverse the entire array and then again reverse from index 0 to x where x is number of rotations.
        // Left Rotation: 


        int singleA[] = {10,20,30,40,50,60,70,80,90};
        int lenNew = singleA.length;

        if(dir == 1){
            int left = 0;
            int right = lenNew-1;
            int temp;

             while(left<right){
                temp = singleA[left];
                singleA[left] = singleA[right];
                singleA[right] = temp;
                left++;
                right--;
            }

            left =0;
            right = x-1;
            
            while(left<right){
                temp = singleA[left];
                singleA[left] = singleA[right];
                singleA[right] = temp;
                left++;
                right--;
            }
            left =x;
            right = lenNew-1;
            while(left<right){
                temp = singleA[left];
                singleA[left] = singleA[right];
                singleA[right] = temp;
                left++;
                right--;
            }
        }
        else{
            int left = 0;
            int right = lenNew-1;
            int temp;

             while(left<right){
                temp = singleA[left];
                singleA[left] = singleA[right];
                singleA[right] = temp;
                left++;
                right--;
            }

            left =0;
            right = lenNew-x-1;

            while(left<right){
                temp = singleA[left];
                singleA[left] = singleA[right];
                singleA[right] = temp;
                left++;
                right--;
            }

            left =lenNew - x;
            right = lenNew-1;
            while(left<right){
                temp = singleA[left];
                singleA[left] = singleA[right];
                singleA[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("\n");
        for(int i:singleA){
            System.out.print(i+" ");
        }


    }


    
}
