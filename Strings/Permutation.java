package Strings;

public class Permutation {
    // Initialize count[26]
    // for I from 1 to N:
    //     count[str1[I]]+=1
    // for I from 1 to N:
    //     count[str2[I]]-=1
    // bool ispermu = true
    // for I from 1 to 26:
    // if(count[I] is not 0):
    //     ispermu = false
    // return is permu

    public static boolean isPermutation(String str1, String str2) {
        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }
    
        int[] count = new int[26]; // Assuming lowercase English letters
    
        // Count occurrences of characters in str1
        for (char c : str1.toCharArray()) {
            count[c - 'a']++;
        }
    
        // Subtract occurrences of characters in str2
        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
        }
    
        // Check if all counts are zero
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
    
        return true;
    }
    
    public static void main(String[] args){
        String str1 = "Mahesh";
        String str2 = "hmaesh";

        Boolean ans = isPermutation(str1,str2);

        if(ans){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's Not a Palindrome");
        }

    }
}
