package Stacks;

import java.util.Stack;

import LinkedList.Node;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }
    
    public int size(){
        return  size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(T ele){
        Node<T> newNode = new Node<T>(ele);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top(){
        return head.data;
    }

    public T pop(){
        Node<T> temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public static boolean isBalanced(String expression) {
        //Your code goes here
        int len = expression.length();
        Stack<Character> stack = new Stack<>();
        for(int i =0; i < len; i++){
            if(stack.size() == 0){
                if(expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']'){
                    return false;
                }
                else{
                    stack.push(expression.charAt(i));
                }
            }
            else{
                    switch (expression.charAt(i)){
                        case ')':
                            if(stack.peek() == '('){
                                stack.pop();
                                break;
                            }
                        case '}':
                            if(stack.peek() == '{'){
                                stack.pop();
                                break;
                            }
                        case ']':
                            if(stack.peek() == '['){
                                stack.pop();
                                break;
                            }
                        default:
                            stack.push(expression.charAt(i));
                            break;
                    }
                }
        }
        if(stack.size() > 0){
            return false;
        }
        return true;

    }

    public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack<Character> stack = new Stack<>();
		int count = 0;
		int len = expression.length();
		for(int i = 0; i < len; i++){
			count = 0;
			char cur = expression.charAt(i);
			if(cur != ')'){
				stack.push(cur);
			}
			else{
				char curpop = stack.pop();
				while(curpop != '('){
					count++;
					curpop = stack.pop();
				}
				if(count > 1){
					continue;
				}
				else{
					return true;
				}
			}
		}
		if(count > 1){
			return false;
		}
		else{
			return true;
		}

	}
    
    public static int[] stockSpan(int[] price) {
		//Your code goes here
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int len = price.length;

		int arr[] = new int[len];
		arr[0] = 1;
		for(int i = 1; i < len; i++){
			while((!stack.isEmpty()) && (price[stack.peek()] < price[i]) ){
				stack.pop();
			}
			if(stack.isEmpty()){
				arr[i] = i+1;
			}
			else{
				arr[i] = i - stack.peek();
			}
			stack.push(i);
		}
		return(arr);
	}
}
