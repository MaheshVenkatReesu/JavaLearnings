package Recursion;

public class KeypadString {

    public static String[] keyStr(int n,String[] options,String[] output){
		if(n == 0){
			output[0] = "";
			return(output);
		}
		int lastDigit = n%10;
		int smallNum = n/10;
		int temp = smallNum;
		int count = 1;
		while(temp >0){
			int last = temp%10;
			count = count*(options[last].length());
			temp = temp/10;
		}
		String[] smallOutput = new String[count];

		String[] smallProb = keyStr(smallNum, options,smallOutput);

		int index  = 0;
		for(int i = 0; i<options[lastDigit].length();i++){
			for(int j = 0; j < smallProb.length;j++){
				if(smallProb[j]!=null){
					output[index] = smallProb[j] + options[lastDigit].charAt(i);
					index++;
				}
			}
		}
		return output;
	}

    public static String[] keypad(int n){
		// Write your code here
		int temp = n;
		int count = 1;
		String[] options = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		while(temp >0){
			int last = temp%10;
			count = count*(options[last].length());
			temp = temp/10;
		}
		String output[] = new String[count];
		return(keyStr(n,options,output));
	}

    public static void main(String[] args){
        int num = 23;
        String[] result = keypad(num);

        for(String i: result){
            System.out.println(i);
        }
    }
}
