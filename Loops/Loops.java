package Loops;

import java.util.*;

public class Loops {
    public static void main(String[] args){

        // Scanner sc1 = new Scanner(System.in);
        // // int n = sc1.nextInt();
        // int i;

        // for(i=0;i<=5;i++){
        //     System.out.println(i);
        // }
        // System.out.println("After exit");
        // System.out.println(i);

        // sc.close();

        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int j;
        int sum=0;

        for(j=0;j<=n;j++){
            sum+=j;
        }
        System.out.println("Final Sum");
        System.out.println(sum);

        sc2.close();
    }
}
