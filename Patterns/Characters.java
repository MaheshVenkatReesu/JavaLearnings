package Patterns;
import java.util.*;

public class Characters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            // int count = 65;
            for(int j=1;j<=n;j++){
                System.out.print((char)('A' + j - 1));
                // count++;
            }
            System.out.println();
        }
        System.out.println("\n");
        int count = 65;
        for(int i=1;i<=n;i++){
            int temp = count;
            for(int j=0;j<n;j++){
                System.out.print((char)(count+j));
                temp++;
            }
            System.out.println();
            count++;
        }
        System.out.println("\n");

		char lastChar = (char)(64+n);

		for(int i=0;i<n;i++){
			for(int j=i;j>=0;j--){
				System.out.print((char)(lastChar - j));
			}
			System.out.println();
		}

        sc.close();
    }
}
