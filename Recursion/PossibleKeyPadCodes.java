package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PossibleKeyPadCodes {
    private static final char OFFSET = 'a' - 1;
	private static void generateCodes(String currentCode, String remainingDigits, List<String> result) {
        // Base case: if there are no remaining digits
        if (remainingDigits.isEmpty()) {
            result.add(currentCode);
            return;
        }

        // Take one digit at a time and generate codes
        int firstDigit = Character.getNumericValue(remainingDigits.charAt(0));
        if (firstDigit > 0) {
            char correspondingChar = (char) (OFFSET + firstDigit);
            generateCodes(currentCode + correspondingChar, remainingDigits.substring(1), result);
        }

        // Take two digits at a time if possible
        if (remainingDigits.length() >= 2) {
            int twoDigitNumber = Integer.parseInt(remainingDigits.substring(0, 2));
            if (twoDigitNumber >= 10 && twoDigitNumber <= 26) {
                char correspondingChar = (char) (OFFSET + twoDigitNumber);
                generateCodes(currentCode + correspondingChar, remainingDigits.substring(2), result);
            }
        }
    }

	public static  String[] getCode(String input){
		// Write your code here
		List<String> result = new ArrayList<>();
        generateCodes("", input, result);
        return result.toArray(new String[0]);
		
	}

    public static void main(String[] args){
        String[] kk = getCode("23");
        for(String i: kk){
            System.out.println(i);
        }
    }
}
