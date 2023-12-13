package Patterns;

import java.util.*;

public class Square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i =1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i =1;i<=n;i++){
            int space = n-i;
            int count = 1;
            // for(int j=1;j<n+(n-space);j++){
            //     if(j<=space){
            //         System.out.print(" ");
            //     }
            //     else{
            //         System.out.print(count);
            //         count++;
            //     }
            // }
            // or we can change condition 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<= 2 * i - 1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<= i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i =1;i<=n;i++){
			int count = 1;
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
				count++;
            }
			for(int k=1;k<n;k++){
				if(count<=n){
					System.out.print(k+" ");
					count++;
				}
			}
            System.out.println();
        }
        System.out.println("\n");
        for(int i =n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
