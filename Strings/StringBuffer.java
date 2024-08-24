package Strings;

public class StringBuffer {
    public static void main(String[] args) {
        java.lang.StringBuffer sb = new java.lang.StringBuffer(100);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        java.lang.StringBuffer sb2 = new java.lang.StringBuffer("Mahesh");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append(" Venkat");
        System.out.println(sb2 + " ");

        System.out.println(System.identityHashCode(sb2));

    }
}