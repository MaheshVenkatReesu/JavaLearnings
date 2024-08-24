package Operators;

public class Operators {
    public static void main(String[] args){
        // Assignment Operator 
        int i = 10;
        int j = i;
        int k = i = 100;

        // System.out.println(i);
        // System.out.println(j);
        // System.out.println(k);


        // Arithematic Operators 
        System.out.println(100+20);
        System.out.println(100-20);
        System.out.println(100*20);
        System.out.println(100/20);
        System.out.println(100%20);

        // Augmented assignment 
        int num =3;
        num = num+3;

        System.out.println(num);

        int a =10;
        a = ((a-5)/(3+6))*a;
        System.out.println(a);

        // unary operators 
        int u = 1;

        u++;
        System.out.println(++u);

        boolean flag = true;

        System.out.println(!flag);





    }
}
