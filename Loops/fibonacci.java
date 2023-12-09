package Loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        System.out.println(0);
        System.out.println(1);

        int k =0;
        int j = 1;
        for(int i=1; i<n; i++){
            int temp = k+j;
            System.out.println(temp);
            k=j;
            j=temp;
        }

        sc2.close();
    }
}
