package TwoDArrays;

public class JaggedArrays {
    public static void main(String[] args){
        

        // jagged
        int arr1[][] = {{1,2,3},{4,5,6,7,8,9}};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        // In 2d Array size of column can be skipped as below unlike one dimensional array
        int arr[][] = new int[3][];
        System.out.println(arr);

        arr[0] = new int[5];
        arr[1] = new int[7];
        arr[2] = new int[10];

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].length);
        }
        System.out.println(arr[0][0]);


    }
}
