package SearchAndSort;

public class BinarySearch {
    public static int BinarySearchMethod(int a[], int si, int ei, int x){
        if(si > ei){
            return -1;
        }
        int midIndex = (si + ei)/2;
        if(a[midIndex] == x){
            return midIndex;
        }
        else if(a[midIndex] < x){
            return(BinarySearchMethod(a, midIndex + 1, ei, x));
        }
        else{
            return(BinarySearchMethod(a, si, midIndex-1,x));
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearchMethod(arr, 0, arr.length-1, 70));
    }
}
