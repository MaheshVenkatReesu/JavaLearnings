package Loops;

import java.util.*;

public class ExitControl {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int radomNumber = random.nextInt();
    System.out.println(radomNumber+"Random Number");
    int guessedNumber;

    do{
        System.out.println("Wrong Number");
        guessedNumber = sc.nextInt();
    }while(guessedNumber != radomNumber);

    System.out.println("You Won!!!!!");

}

}
