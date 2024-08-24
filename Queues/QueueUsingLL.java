package Queues;

import LinkedList.Node;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(T ele){
        if(front == null){
            front.data = ele;
            rear = front;
        }
        else{
            // rear.next = ele;
        }
    }

    // public T front(){

    // }

    // public T dequeue(){

    // }

    
}
