package Recursion;
import java.util.*;

public class PermutationString {

    private static void generatePermutationsHelper(String prefix, String remaining, List<String> result) {
        int length = remaining.length();

        // Base case: if the remaining string has only one character
        if (length == 1) {
            result.add(prefix + remaining);
            return;
        }

        // Recursive step: generate permutations for each character in the remaining string
        for (int i = 0; i < length; i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutationsHelper(newPrefix, newRemaining, result);
        }
    }

    public static String[] permutationOfString(String input){
		// Write your code here
		List<String> result = new ArrayList<>();
        generatePermutationsHelper("", input, result);
        return result.toArray(new String[0]);
	}
    public static void main(String[] args){
        String[] kk = permutationOfString("abc");
        for(String i: kk){
            System.out.println(i);
        }
    }
}
