package Strings;

public class Strings {
    public static void main(String[] args){
        char ch[] = {'a','b','c','d'};
        System.out.println(ch);
        System.out.println(ch.toString());
        // char ch2[] = new char[10];

        // By assiging string literals
        String s1 = "Mahesh";
        String s2 = "Venkat";

        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(3));

        // By using new key word Passing stringliteral
        String str = new String("Coding");

        // passing charcter array
        char character[] = {'r','e','e','s','u'};
        String str2 = new String(character);

        // Passing byte array
        byte b[] = {97,98,99,100,101};
        String str3 = new String(b);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);





    }
}
