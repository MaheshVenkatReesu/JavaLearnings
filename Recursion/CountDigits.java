package Recursion;

public class CountDigits {
    public static int countDigits(int n){
        // Write your code here.
        if(n==0){
            return(0);
        }
        int smallOutput = countDigits(n/10);
        int output = 1+smallOutput;
        return(output);
    }

    public static void main(String[] args){
        int num = 5238476;
        System.out.println(countDigits(num));
    }
}
