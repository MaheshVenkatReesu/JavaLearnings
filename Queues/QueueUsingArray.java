package Queues;

public class QueueUsingArray {
    private int size;
    private int data[];
    private int front,rear;

    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity){
        data = new int [capacity];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int ele){
        if(front == -1){
            front++;
            rear++;
            data[rear] = ele;
        }
        else{
            rear++;
            data[rear] = ele;
        }
        size++;
    }

    public int front(){
        return data[front];
    }

    public int dequeue() {
        int temp = data[front];
        front++;
        size--;
        return(temp);
    }

}
