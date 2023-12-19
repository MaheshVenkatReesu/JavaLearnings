package Strings;

import java.util.*;

public class Reverse {

    public static void Reverse(String str){
        String str2 = new String();

        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }

        System.out.println(str2);
    }

    public static void ReverseWord(String str){
        String ch[] = str.split(" ");
        String finalReverse = "";
        for(String word: ch){
            String str2 = "";
            for(int i=word.length()-1;i>=0;i--){
                str2+=word.charAt(i);
            }
            finalReverse += str2+" ";
        }
        System.out.println(finalReverse);

    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Reverse(str);
        ReverseWord(str);
    }
}
