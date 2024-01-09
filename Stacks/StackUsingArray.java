package Stacks;

public class StackUsingArray {
    private static int data[];
    private static int topIndex;

    public StackUsingArray(){
        data = new int[10];
        topIndex = -1;
    }

    public static void print(){
        for(int i = 0; i <= topIndex ; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public void push(int ele){
        if(topIndex == data.length - 1){
            // throw new StackFullException();
            doubleCapacity();
        }
        // topIndex+=1;
        data[++topIndex] = ele;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }

    public int size(){
        return topIndex+1;
    }

    public int top(){
        return data[topIndex];
    }

    public int pop(){
        if(topIndex == -1){
            return -1;
        }
        topIndex-=1;
        return data[topIndex+1];
    }

    public boolean isEmpty(){
        if(topIndex == -1){
            return true;
        }
        return false;
    }
}
