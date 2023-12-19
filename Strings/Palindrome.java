package Strings;

import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int left = 0;
        int right = str.length()-1;
        boolean flag = true;
        while(left<right){
            if(str.charAt(left) !=str.charAt(right)){
                System.out.println("Not a Palindrome");
                flag = false;
                break;
            }
            else{
                left++;
                right--;
            }
        }
        if(flag){
            System.out.println("Yes it is Palindrome");
        }
    }    
}
