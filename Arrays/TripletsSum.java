package Arrays;
import java.util.Arrays;
// Finding number of triplets whose sum is equal to given number
public class TripletsSum {
    public static int findTriplet(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;

        int ans = 0;
        for(int i=0;i<=n-3;i++){
            int low = i+1;
            int high = n-1;

            while(low < high){
                int currSum = arr[i] + arr[low] + arr[high];
                if(currSum == num){
                    ans += 1;
                    int tempHigh = high - 1;
                    while(tempHigh > low){
                        if(arr[high] == arr[tempHigh]){
                            ans += 1;
                            tempHigh--;
                        }
                        else{
                            break;
                        }
                    }
                    low++;
                }
                else if(currSum > num){
                    high--;
                }
                else{
                    low++;
                }
            }

        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 9, 9, 1, 7, 5, 5, 10, 1, 0, 7};
        int x = 16;
    
        int result = findTriplet(arr, x);
        System.out.println("Number of triplets: " + result);
    }
    
    
}
