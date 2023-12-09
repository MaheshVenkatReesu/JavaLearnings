package Loops;

import java.util.*;

public class Prime {
    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();
        int flag=0;

        for(int j=2;j<n;j++){
            if(n%j == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){

            System.out.println("Not Prime");
        }
        else{

            System.out.println("Prime");
        }

        sc2.close();

    }
    
}
