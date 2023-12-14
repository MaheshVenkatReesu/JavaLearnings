package Methods;
import java.util.*;

public class Factorial {
    public static float fact(int n){
        long prod= 1;
        for(int i=1;i<=n;i++){
            prod=prod*i;
        }
        return prod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n<0 || r<0){
            return;
        }

        System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }
}
