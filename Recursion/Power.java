package Recursion;

public class Power {
    public static int power(int x, int n) {
        if(n==0){
            return(1);
        }
        int smallOutput = power(x, n-1);
        int output = x*smallOutput;
        return(output);
		
	}
    public static void main(String[] args){
        int num = 5;
        int pow = 3;
        System.out.println(power(num, pow));
    }
}
