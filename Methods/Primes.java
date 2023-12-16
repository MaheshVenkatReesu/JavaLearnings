package Methods;

import java.util.*;

public class Primes {
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n){
        for(int i=2;i<=n;i++){
            boolean prime = isPrime(i);
            if(prime == true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPrimes(n);
    }
    
}
