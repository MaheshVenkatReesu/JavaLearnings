package Patterns;
import java.util.*;

public class Inverted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=1;i<=n;i++){
            int temp =i;
            int count=n-i;
            while(count>0){
                System.out.print(" ");
                count--;
            }
            for(int j=1;j<i;j++){
                System.out.print(temp);
                temp++;
            }
            for(int j=temp;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("\n");
        for(int i=1;i<=n;i++){
            int temp =1;
            int count=n-i;
            while(count>0){
                System.out.print(" ");
                count--;
            }
            for(int j=1;j<i;j++){
                System.out.print(temp);
                temp++;
            }
            for(int j=temp;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n");
        for(int i=n;i>0;i--){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
