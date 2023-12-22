package Recursion;

public class CountZeros {
    public static int countZerosRec(int n){
		if(n <= 9){
			if(n == 0){
				return(1);
			}
			else{
				return(0);
			}
		}
		else{
			if(n%10 == 0){
				return(1+countZerosRec(n/10));
			}
			else{
				return(0+countZerosRec(n/10));
			}
		}
	}
    public static void main(String[] args){
        int num = 5200476;
        System.out.println(countZerosRec(num));
    }
}
