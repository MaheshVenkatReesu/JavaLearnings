package Strings;

import java.util.Scanner;

public class Substrings {
    public static void printSubstrings(String str) {
		//Your code goes here
		int len = str.length();
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				System.out.println(str.substring(i, j+1));
			}
		}
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        printSubstrings(str);
    }
}
