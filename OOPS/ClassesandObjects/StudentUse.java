package OOPS.ClassesandObjects;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // creating constructer when you have your own constructer and required certain parameters.
        Student s1 = new Student("Babu",99);
        Student s2 = new Student("Babu",99);
        // if you dont want to make num madate and only name is enough create one more constructor withsame name and only initiate for name(Constructor Overloading)

        // Student s2 = new Student(); this is default way of creating object when you didn't create your own constructer and uses default one

        // Here s1 ans s2 are not actual objects but references to the corresponding objects
        // s1 and s2 will be present in stack pointing to original objects in heap memeory
        // below line will print classname followed by @hexadecimal code
        System.out.println(s1);
        // s1.name = "Mahesh";
        // s1.rollNumber = 7;
        System.out.println(s1.name+" "+s1.getRollNumber());
        // s2.name = "Venkat";
        // s2.rollNumber = 9;
        // System.out.println(s2.name+" "+s2.rollNumber);

        s1.setrollNumber(23);
        System.out.println(s1.name+" "+s1.getRollNumber());
        System.out.println(Student.getStudentNum());
        System.out.println(s2.getStudentNum());
    }
}
