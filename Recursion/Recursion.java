package Recursion;
 import java.util.*;

public class Recursion {
    public static int fact(int n){
        if(n == 0){
            return 1;
        } 
        int smallOutput = fact(n-1);
        int output = n*smallOutput;
        return(output);
    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        } 
        int smallOutput = sum(n-1);
        int output = n+smallOutput;
        return(output);
    }
    public static void main(String[] args){
        System.out.println("Factorial "+fact(5));
        System.out.println("Sum "+sum(5));
    }
}
