package Arrays;

public class SortZerosOnes {
    public static void main(String[] args){
            //Your code goes here
            int arr[] = {0,1,1,1,0,0,0,1,0,1,0,1,0};
            int left = 0;
            int right = arr.length - 1;
    
            while (left < right) {
                while (arr[left] == 0 && left < right) {
                    left++;
                }
    
                while (arr[right] == 1 && left < right) {
                    right--;
                }
    
                if (left < right) {
                    // Swap arr[left] and arr[right]
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
