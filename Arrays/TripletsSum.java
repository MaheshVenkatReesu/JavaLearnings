package Arrays;
// Finding number of triplets whose sum is equal to given number
public class TripletsSum {
    public static int findTriplet(int[] arr, int x) {
        int n = arr.length;
        int triplets = 0;
    
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        triplets++;
                    }
                }
            }
        }
    
        return triplets;
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 9, 9, 1, 7, 5, 5, 10, 1, 0, 7};
        int x = 16;
    
        int result = findTriplet(arr, x);
        System.out.println("Number of triplets: " + result);
    }
    
    
}
