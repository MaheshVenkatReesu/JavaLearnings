package Implicit;

public class Implicit {
    public static void main(String[] args){
        short currentYear = 2030;
        byte age = 39;

        // int birthYear = currentYear - age;

        // Type Casting
        short birthYear = (short)(currentYear - age);
        byte year = (byte) currentYear;

        System.out.println(birthYear);
    }
}
