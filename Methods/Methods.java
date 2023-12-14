package Methods;

import java.util.*;

public class Methods {
    public static void printDetails(String name, String dob, long phone, String place){
        System.out.println("Name -"+ name);
        System.out.println("DOB -"+ dob);
        System.out.println("Place -"+place);
        System.out.println("Country - India");
        System.out.println("Phone -"+phone);
    }

    public static int square(int n){
        
        int squ = n*n;
        return squ;
    }

    public static int total(int a, int b, int c){
        a++;
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        printDetails("Mahesh Venkat", "09/09/09", 1234567891, "Vizag");
        printDetails("Mahesh Babu", "09/09/01", 1234567891, "Hyderabad");
        int add = total(a,b,c);

        int ans = square(5);
        System.out.println(ans);
        System.out.println(add);

        System.out.println(a);
    }
}
