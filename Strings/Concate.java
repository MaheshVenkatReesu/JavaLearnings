package Strings;

public class Concate {
    public static void main(String[] args){
        String firstName = "Mahesh";
        String lastName = "Venkat";

        int age = 24;

        char ch = 'a';
        char ch2 = 'b';

        System.out.println(ch+ch2);

        String fullName = firstName+' '+lastName;

        System.out.println(fullName);
        System.out.println(fullName+" is "+ age + " years old.");
    }
}
