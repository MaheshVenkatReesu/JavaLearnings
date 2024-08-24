package Loops;

import java.util.*;
public class WhileExample {

    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        while(n!=0){
            System.out.println(n%10);
            n/=10;
        }

        sc2.close();
    }
    
}
