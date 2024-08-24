package Recursion;

public class CheckSorting {
    public static Boolean sortCheck(int[] arr, int si){
        // if(arr.length == 1){
        //     return(true);
        // }
        // if(arr[0]>arr[1]){
        //     return false;
        // }
        // int smallArr[] = new int[arr.length - 1];
        // for(int i = 1; i < arr.length;i++){
        //     smallArr[i-1] = arr[i];
        // }
        // Boolean isSmallArrSorted = sortCheck(smallArr);
        // return(isSmallArrSorted);
        if(si == arr.length - 1){
            // this means array has only one element
            return true;
        }
        if(arr[si] > arr[si + 1]){
            return false;
        }
        Boolean isSmallArrSorted = sortCheck(arr, si+1);
        return(isSmallArrSorted);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        System.out.println(sortCheck(arr,0));
    }
}
