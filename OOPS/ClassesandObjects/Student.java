package OOPS.ClassesandObjects;

public class Student {
    String name;
    private int rollNumber;
    double cgpa;
    final double conversionFactor = 0.95;
    private static int numStudents;
    // we made static private because no one will change the value directly
    // Creating Constructer
    public Student(String n, int num){
        name = n;
        rollNumber = num;
        numStudents++;
    }
    public Student(String n){
        name = n;
        rollNumber = 10;
        numStudents++;
    }
    // instead of directly giving public access i can make them accessable by use setter and getter methods because by adding conditions we can control how much they can be accessable 
    public int getRollNumber(){
        return rollNumber;
    }
    public static int getStudentNum(){
        return numStudents;
    }
    // public void setrollNumber(int num){
    //     if(num <= 0){
    //         return;
    //     }
    //     rollNumber = num;
    // }
        // OR 
    public void setrollNumber(int rollNumber){
        if(rollNumber <= 0){
            return;
        }
        this.rollNumber = rollNumber;
    }

    // Instead of num if you want to use rollNumber as variable it will miss match because it is messing with initial declaration of property
    // if you want to use variable you need to use "this" keyword
    // this keyword will have address of student s1 object
    

}
