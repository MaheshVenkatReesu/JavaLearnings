package SearchAndSort;

public class QuickSort {
    public static int partition(int[] a, int si, int ei){
        int pivotElement = a[si];
        int smallerNumCount = 0;
        for(int i = si + 1; i <= ei; i++){
            if(a[i] < pivotElement){
                smallerNumCount++;
            }
        }
        int temp = a[si + smallerNumCount];
        a[si + smallerNumCount] = pivotElement;
        a[si] = temp;

        int i = si;
        int j = ei;
        while(i < j){
            if(a[i] < pivotElement){
                i++;
            }
            else if(a[j] >= pivotElement){
                j--;
            }
            else{
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return (si + smallerNumCount);
    }
    public static void QuickSortMethod(int[] a, int si, int ei){
        if(si >= ei){
            return;
        }
        int pivotIndex = partition(a,si,ei);
        QuickSortMethod(a, si, pivotIndex-1);
        QuickSortMethod(a, pivotIndex + 1, ei);
    }
    public static void main(String[] args){
        int arr[] = {10,4,5,9,8,6,12,11,7};
        QuickSortMethod(arr,0,arr.length - 1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
