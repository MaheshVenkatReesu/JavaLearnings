package Loops;

import java.util.*;
public class Nested {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<=n;i++){
            int flag=0;
            if(i%2==0){
                continue;
            }
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }

            if(flag != 1){
                System.out.println(i);
            }
        }
    }
    
}
