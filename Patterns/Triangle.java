package Patterns;

import java.util.*;

public class Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.print("\n");
        int count =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

        System.out.print("\n");
        for(int i=1;i<=n;i++){
            int temp =i;
            for(int j=1;j<=i;j++){
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
