package Stacks;

public class StackUse {
    public static void main(String[] args){
        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.top());
        stack.print();
        System.out.println(stack.size());
        stack.print();
        System.out.println(stack.isEmpty());
        stack.print();
    }
}
