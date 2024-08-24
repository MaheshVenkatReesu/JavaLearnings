package Strings;

import java.util.*;
public class CountWords {
    public static void countWords(String str){
        int countWithSplit =0;
        int countWithoutMethod = 0;
        String ch[] = str.split(" ");
        for(String word: ch){
            System.out.println(word);
            countWithSplit++;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                countWithoutMethod++;
            }
        }
        System.out.println("Count with method split "+countWithSplit);
        System.out.println("Count without method split "+(countWithoutMethod+1));
    }

    public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int len = str.length();
		String ch[] = str.split("");
		String nn = new String("");
        int flag = 0;
		for(int i=0;i<len-1;i++){
			if(ch[i].equals(ch[i+1])){
				continue;
			}
			else{
                flag = 1;
				if(i == len-2){
					nn = nn + ch[i];
					nn = nn + ch[i+1];
				}
				else{
					nn = nn + ch[i];
				}
			}
		}
		str = nn;
        if(flag ==0){
            str = nn+ch[0];
        }
		return str;
	}

    public static char highestOccuringChar(String str) {
		//Your code goes here
		int len = str.length();
		int max =0;
		char maxChar = '\u0000';
		String ss[] = str.split("");
		for(int i=0;i<len;i++){
			int count = 0;
			if(ss[i]!=" "){
				for(int j=i;j<len;j++){
					if(ss[i].equals(ss[j])){
						if(i!=j){
							ss[j].equals(" ");
							count++;
						}
						else{
							count++;
						}
					// System.out.println(count);
					}
				}
				if(count>max){
					max = count;
					maxChar = str.charAt(i);
				}
			}
			
		}
		return(maxChar);
	}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // countWords(str);
        String sss = removeConsecutiveDuplicates(str);
        System.out.println(sss);
    }
}
