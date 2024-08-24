package Arrays;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args){
        int A[] = {1,2,3,4,5,6,7,8,9};
        int max = A[0];
        int max2 = A[0];

        for(int i:A){
            if(i>max){
                max2 = max;
                max = i;
            }
            else if(i>max2){
                max2 = i;
            }
        }
        System.out.println(max2);
    }
}
