package Recursion;

public class ConvertStringtoNumber {
    public static int convert(char[] input,int ei){
		if(ei == 0){
			return((input[0] - '0'));
		}
		// System.out.println(input[ei]);
		int smallout = convert(input, ei-1);
		return((smallout*10)+(input[ei] - '0'));
	}
    public static void main(String[] args){
        String num = "5238476";
        char[] charArray = num.toCharArray();
        System.out.println(convert(charArray,num.length()-1));
    }
}
