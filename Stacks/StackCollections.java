package Stacks;

import java.util.Stack;
public class StackCollections {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
