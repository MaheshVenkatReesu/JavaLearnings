package Recursion;

public class Splitinto2GroupsofEqualSum {
    public static boolean helper(int[] arr, int n, int start, int sumLeft, int sumRight){
		if(start == n){
			return(sumLeft == sumRight);
		}
		else if(arr[start] % 5 == 0){
			sumLeft += arr[start];
		}
		else if(arr[start] % 3 == 0){
			sumRight += arr[start];
		}
		else{
			return helper(arr, n, start+1, sumLeft+arr[start], sumRight) || helper(arr, n, start+1, sumLeft, sumRight+arr[start]);
		}
		return helper(arr, n, start+1, sumLeft, sumRight);
	}

	public static boolean splitArray(int input[]) {
		int sumLeft = 0;
		int sumRight = 0;
		int start = 0;
		return(helper(input, input.length, start, sumLeft, sumRight));
	}
    public static void main(String[] args){
        int[] input = {1,4,3,2};
        System.out.println(splitArray(input));
    }
}
