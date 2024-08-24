package Strings;

import java.util.*;
public class StringInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // nextLine
        String str = sc.nextLine();
        System.out.println(str);

        // next() this will stop taking input immediately it finds a delimiter(space, , ,. ,......)
        String str1 = sc.next();
        System.out.println(str1);
        String str2 = sc.next();
        System.out.println(str2);
    }
}
