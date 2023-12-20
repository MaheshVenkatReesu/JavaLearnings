package TwoDArrays;

import java.util.*;

public class UserInput {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Rows");
        int rows = sc.nextInt();

        System.out.println("Enter no of Columns");
        int columns = sc.nextInt();

        int A[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter the element at A["+i+"]["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }
        return(A);
    }
    public static void main(String[] args){
        
        int arr[][] = takeInput();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // Using for each loop
        for(int i[]:arr){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }    
}
