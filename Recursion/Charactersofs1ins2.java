package Recursion;

public class Charactersofs1ins2 {
    public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(b.length() == 1){
			 if(a.indexOf(b) >= 0){
				 return true;
			 }
			 else{
				 return false;
			 }
		 }
		 int current = a.indexOf(b.substring(0, 1));
		 if(current >=0){
			 return checkSequence(a.substring(current+1), b.substring(1));
		 }
		 return false;

	}

    public static void main(String[] args){
        String s1 = "Mahesh";
        String s2 = "heh";
        System.out.println(checkSequence(s1, s2));
    }
}
