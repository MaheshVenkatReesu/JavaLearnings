package TwoDArrays;

import java.util.Scanner;

public class HighestSumColumn {
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

    public static void LargestSumColumn(int arr[][]){
        int rows = arr.length;
        int columns = arr[0].length;
        int max =0;
        for(int i=0;i<columns;i++){
            int sum =0;
            for(int j=0;j<rows;j++){
                sum+=arr[j][i];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        
        int arr[][] = takeInput();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        LargestSumColumn(arr);


    }
}
