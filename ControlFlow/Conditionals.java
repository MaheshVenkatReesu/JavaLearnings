package ControlFlow;
import java.util.*;
/**
 * Conditionals
 */
public class Conditionals {

    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        // int num = sc.nextInt();
        // sc.close();

        // // to check even or not
        // if(num%2 ==0){
        //     System.out.println("Yes I'm Even");
        // }
        // else{
        //     System.out.println("No I'm Not Even");
        // }

        // // to check positive or not
        // if(0-num < 0){
        //     System.out.println("Yes I'm Positive");
        // }

        // else if(0-num ==0){
        //     System.out.println("I'm Neither Positive nor Negative");
        // }
        // else{
        //     System.out.println("No I'm Not Positive");
        // }

        Scanner sc2 = new Scanner(System.in);

        int day = sc2.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
            System.out.println("Enter valid Day number");
                break;
        }

    }
}