package TwoDArrays;

import java.util.Scanner;

public class SetZeros {
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

    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] row = new int[rows];
        int[] col = new int[columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<rows;i++){
            if(row[i]==1){
                for(int j=0;j<columns;j++){
                    matrix[i][j] = 0;
                }
            }
        }

         for(int j=0;j<columns;j++){
            if(col[j]==1){
                for(int i=0;i<rows;i++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        
        int arr[][] = takeInput();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

        setZeros(arr);

    }    
}
