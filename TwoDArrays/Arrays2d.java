package TwoDArrays;

public class Arrays2d {
    public static void main(String[] args){
        int a[][] = new int[3][4];

        int[][] b = new int[3][4];

        int []c[] = new int[3][4];

        // d and e single dimensional while f is double dimensional array
        int[] d,e,f[];


        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
