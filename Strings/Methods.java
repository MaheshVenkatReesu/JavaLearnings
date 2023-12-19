package Strings;

public class Methods {
    public static void main(String[] args){
        String str = "   Mahesh is a star  ";
        System.out.println(str.trim());

        // Length
        System.out.println(str.length());

        // charAt()


        // trim
        System.out.println(str.trim());

        // substring
        // end index not included
        System.out.println(str.substring(7, 17));
        System.out.println(str.substring(7));

        // replace
        System.out.println(str.replace('s', '*'));

        // index and lastindex
        int index = str.indexOf('t');
        int starIndex = str.indexOf('*');
        int lastIndex = str.lastIndexOf('a');
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(starIndex);

        int startIndex = str.indexOf('h', 2);
        System.out.println(startIndex);


        // Equals
        String es1 = "Hello";
        String es2 = "Helloa";
        System.out.println(es1.equals(es2));

        // compareto
        System.out.println(es1.compareTo(es2));
    }
}
