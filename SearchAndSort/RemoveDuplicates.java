package SearchAndSort;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <= 1){
			return s;
		}
		String smallOuput = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0) == s.charAt(1)){
			return(smallOuput);
		}
		else{
			return(s.charAt(0)+smallOuput);
		}
	}

    public static void main(String[] args){
        System.out.println(removeConsecutiveDuplicates("abdxxdxex"));   
    }
}
