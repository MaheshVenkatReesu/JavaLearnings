package Recursion;

public class CheckIndexOfNumber {
    public static int indexCheck(int[] arr, int si, int x){
        if(si == arr.length){
				return -1;
            // this means array has only one element
        }
		 if(arr[si] == x){
				return si;
		}
        int SmallArr = indexCheck(arr, si+1, x);
        return(SmallArr);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        int num = 7;
        System.out.println(indexCheck(arr,0,num));
    }
}
