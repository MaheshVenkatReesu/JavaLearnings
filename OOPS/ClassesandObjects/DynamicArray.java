package OOPS.ClassesandObjects;

public class DynamicArray {
    int[] data;
    int nextElementIndex;

    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }

    public int size(){
        return data.length;
    }

    public boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public int get(int i){
        if(i >= nextElementIndex){
            // Throw Error
            return -1;
        }
        return data[i];
    }

    public void set(int i, int ele){
        if(i >= nextElementIndex){
            // Throw Error
            return;
        }
        data[i] = ele;
    }

    public void add(int element){
        data[nextElementIndex]= element;
        nextElementIndex++;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i =0;i<temp.length;i++){
            data[i] = temp[i];
        }
    }

    public int removeLast(){
        if(nextElementIndex == 0){
            return -1;
        }
        int temp = data[nextElementIndex - 1];
        nextElementIndex--;
        return temp;
    }

    
}
