package Arrays;
import java.util.*;

public class UniqueElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,2,2,3,3,4};

        int len = arr.length;
        int m = (len-1)/2;
        int B[] = new int[m+1];
        int count = 0;
        int sum = 0;
        for(int i=0;i<len;i++){
          int flag = 0;
          for(int j=0;j<m+1;j++){
            if(arr[i]==B[j]){
              flag = 1;
            }
          }
          if(flag == 0){
            B[count] = arr[i];
            count++;
            sum+=arr[i];
          }
          else{
            sum-=arr[i];
          }
        }
        System.out.println(sum);
    }
}
