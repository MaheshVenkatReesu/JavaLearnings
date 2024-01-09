package LinkedList;
import java.util.*;

import LinkedListRecursion.print;
public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return(n1);
    }

    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null,tail = null;
        while(data != -1){
            Node<Integer> currNode = new Node<Integer>(data);
            if(head == null){
                head = currNode;
                tail = currNode;
            }
            else{
                // Node<Integer> tail = head;
                // while(tail.next != null){
                //     tail = tail.next;
                // }
                // tail.next = currNode;
                tail.next = currNode;
                tail = currNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void increment(Node<Integer> head){
        Node<Integer> current = head;
        while(current!=null){
            current.data++;
            current = current.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		Node<Integer> n1 = new Node<>(data);
		if(pos == 0){
			n1.next = head;
			head = n1;
		}
		else{
			Node<Integer> current = head;
			int count = 0;
			while(count < pos-1){
				if(current.next == null){
					return head;
				}
				current = current.next;
				count+=1;
			}
			n1.next = current.next;
			current.next = n1;
		}
		return head;
	}

    public static Node<Integer> insertR(Node<Integer> head, int pos, int data){
        if(pos == 0){
            Node<Integer> n1 = new Node<>(data);
            n1.next = head;
            return n1;
        }
        Node<Integer> smallNode = insertR(head.next, pos-1, data);
        head.next = smallNode;
        return head;
    }

    public static Node<Integer> deleteR(Node<Integer> head, int pos){
        if(pos == 0){
            return head.next;
        }
        Node<Integer> smallNode = deleteR(head.next, pos-1);
        head.next = smallNode;
        return head;
    }

    public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> current = head;
		int count = 0;
        while(current!=null){
            if(current.data == n){
				return count;
			}
			count++;
            current = current.next;
        }
		return -1;
	}

    public static Node<Integer> removeConsecutiveDuplicates(Node<Integer> head) {
		//Your code goes here
		Node<Integer> current = head;
		Node<Integer> prev = null;
        while(current != null){
            if(prev != null && current.data.equals(prev.data)){
				prev.next = current.next;
				current = prev.next;
			}
			else{
				prev = current;
				current = current.next;
			}

        }
		return head;
	}

    public static void printReverse(Node<Integer> root) {
		//Your code goes here
		if(root == null){
			return;
		}
		if(root.data == -1){
			// System.out.print(root.data+ " ");
			return;
		}

		printReverse(root.next);
		System.out.print(root.data+" ");
		return;
	}

    public static Node<Integer> ReverseLL(Node<Integer> head) {
		//Your code goes here
		Node<Integer> temp = head;
        Node<Integer> prev = null;
        Node<Integer> front = null;

        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return(prev);
	}

    public static Node<Integer> reverseLLR(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> newHead = head.next;
        head.next = null;
        Node<Integer> smallNode = reverseLLR(newHead);
        newHead.next = head;
        return smallNode;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        if(slow == null || slow.next == null){
            return head;
        }

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return(slow);
    }

    static Node<Integer> mergeSorted(Node<Integer> left, Node<Integer> right){
        if (left == null)
            return right;
        if (right == null)
            return left;
        Node<Integer> res = null;
        if (left.data <= right.data){
            res = left;
            res.next = mergeSorted(left.next, right);   
        }
        else {
            res = right;
            res.next = mergeSorted(left, right.next);   
        }
        return res;
    }

	public static Node<Integer> mergeSort(Node<Integer> head) {
        if (head == null || head.next == null){
            return head;
        }
        Node<Integer> mid = midPoint(head);
        Node<Integer> nextToMid = mid.next;
        mid.next = null;
        Node<Integer> left = mergeSort(head);
        Node<Integer> right = mergeSort(nextToMid);
        Node<Integer> res = mergeSorted(left, right);
        return res;
	}

    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        // Create a dummy node to simplify the merging logic
        Node<Integer> dummy = new Node<>(-1);
        Node<Integer> current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // If one of the lists is not yet exhausted, append the remaining nodes
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        // The merged list starts from the next of the dummy node
        return dummy.next;
    }

    public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		ArrayList<Integer> arr=new ArrayList<>();
        while(head != null) {
            arr.add(head.data);
            head = head.next;
        }
        for(int i=0;i<arr.size()/2;i++) 
            if(arr.get(i) != arr.get(arr.size()-i-1)) return false;
        return true;

	}

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> current = head;
        Node<Integer> evenHead = null;
        Node<Integer> oddHead = null;
        Node<Integer> evenTail = null;
        Node<Integer> oddTail = null;

        while(current != null){
            if(current.data % 2 ==0){
                if(evenHead == null){
                    evenHead = current;
                    evenTail = current;
                }
                else{
                    evenTail.next = current;
                    evenTail = current;
                }
            }
            else{
                 if(oddHead == null){
                    oddHead = current;
                    oddTail = current;
                }
                else{
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = current.next;
        }
        if(evenTail != null){
            evenTail.next =  null;
        }
        if(oddHead == null){
            return evenHead;
        }
        oddTail.next = evenHead;
        return(oddHead);
	}

    public static Node<Integer> bubbleSort(Node<Integer> head) {
		if (head == null || head.next == null) {
			return head; // Already sorted or empty list
		}

		boolean swapped;
		Node<Integer> current;
		Node<Integer> lastSorted = null;

		do {
			swapped = false;
			current = head;

			while (current.next != lastSorted) {
				if (current.data > current.next.data) {
					// Swap data
					int temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;

					swapped = true;
				}
				current = current.next;
			}
			lastSorted = current;
		} while (swapped);

		return head;
	}

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if (head == null || i == j) {
            return head; // No need to swap if the list is empty or i equals j
        }

        Node<Integer> prev1 = null, curr1 = head;
        Node<Integer> prev2 = null, curr2 = head;

        // Locate the nodes at positions i and j and their predecessors
        for (int count = 0; count < i && curr1 != null; count++) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        for (int count = 0; count < j && curr2 != null; count++) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        // If either i or j is out of bounds, or both nodes are the same, no swapping needed
        if (curr1 == null || curr2 == null || curr1 == curr2) {
            return head;
        }

        // Adjust the next pointers to perform the swap
        if (prev1 != null) {
            prev1.next = curr2;
        } else {
            head = curr2; // If i is at the head, update the head
        }

        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1; // If j is at the head, update the head
        }

        Node<Integer> temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;

        return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node<Integer> head = createLinkedList();
        // Node<Integer> head = takeInput();
        Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1);
        // System.out.println(n1.data);
        // System.out.println(n1.next);
        increment(head);
        // print(head);
        // insert(head, 3, 1999);
        print(head);
        insert(head, 3, 55);
        print(head);
        deleteR(head, 1);
        print(head);
        // Node<Integer> newHead = ReverseLL(head);
        // print(newHead);
        Node<Integer> newHeadR = reverseLLR(head);
        System.out.print("Mahesh");
        print(newHeadR);

    }
}
