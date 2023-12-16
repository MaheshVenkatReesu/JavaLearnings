package Methods;

import java.util.*;

public class Overloading {
    public static void sum(int a,int b){
        System.out.println("sum of 2 integers");
        System.out.println(a+b);
    }

    public static void sum(int a,int b,int c){
        System.out.println("Sum of 3 integers");
        System.out.println(a+b);
    }

    public static void sum(double a,int b){
        System.out.println("sum of one double and one int");
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();

        sum(a,b,c);
        sum(10.f,20);
        sum(a,b);
    }
}
