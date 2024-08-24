package Loops;

import java.util.*;
public class FindEvens {
    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        for(int j=1, count = 0;j<=n && count < 4;j++){
            if(j%2 == 0 && count<4){
                System.out.println(j);
                count++;
            }
        }

        sc2.close();

    }
    
}


