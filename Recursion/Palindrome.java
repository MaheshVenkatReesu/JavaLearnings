package Recursion;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int len = str.length();
        if(len == 0 || len == 1){
            return(true);
        }
        if(str.charAt(0) != str.charAt(len-1)){
            return(false);
        }
        return(isPalindrome(str.substring(1,len-1)));
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("kka"));
    }
}
