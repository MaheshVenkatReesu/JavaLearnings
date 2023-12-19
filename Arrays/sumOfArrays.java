package Arrays;

import java.util.*;
public class sumOfArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {9,8,7,6};
        
        int n = arr1.length-1;
        int m = arr2.length-1;
        int output[] = new int[Math.max(n, m)+1];

        int p =output.length-1;

        int carry = 0;
        if(n==0 && m==0){
            return;
        }
        else if(n==0){
            while(m>=0){
                output[p] = arr2[m];
                p--;
                m--;
            }
        }
        else if(m==0){
            while(n>=0){
                output[p] = arr1[n];
                p--;
                n--;
            }
        }
        else{
            while(n>=0 && m>=0){
                int sum = arr1[n]+arr2[m]+carry;
                if(sum>9){
                    output[p] = sum%10;
                    carry = sum/10;
                }
                else{
                    output[p] = sum;
                    carry = 0;
                }
                p--;
                n--;
                m--;
            }

            while(n>=0){
                int sum = arr1[n]+carry;
                if(sum>9){
                    output[p] = sum%10;
                    carry = sum/10;
                }
                else{
                    output[p] = sum;
                    carry = 0;
                }
                p--;
                n--;
            }

            while(m>=0){
                int sum = arr2[m]+carry;
                if(sum>9){
                    output[p] = sum%10;
                    carry = sum/10;
                }
                else{
                    output[p] = sum;
                    carry = 0;
                }
                p--;
                m--;
            }

            while(p>=0){
                if(carry>0){
                    output[p] = carry;
                    p--;
                }
                else{
                    p--;
                }
            }
        }
        for(int i:output){
            System.out.print(i+" ");
        }
    }
    
}
