package ArrayList;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    // public static ArrayList<Integer> removIntegers(int arr[]){

    // }
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(80);

        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i) == arr.get(i+1)){
                arr.remove(i);
            }
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
