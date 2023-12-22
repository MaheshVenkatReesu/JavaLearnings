package Recursion;

public class Fibannoci {
    public static int fib(int n){
        if(n == 1 || n == 2){
            return(1);
        }
        int output = fib(n-1) + fib(n-2);
        return(output);
    }
    public static void main(String[] args){
        int num = 6;
        System.out.println(fib(num));
    }
}
