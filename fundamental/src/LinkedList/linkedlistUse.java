package LinkedList;

import java.util.Scanner;

public class linkedlistUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		// System.out.println("n1 "+n1+" data "+n1.data+" next "+n1.next);
		n2.next = n3;
		// System.out.println("n2 "+n2+" data "+n2.data+" next "+n2.next);
		n3.next = n4;
		// System.out.println("n3 "+n3+" data "+n3.data+" next "+n3.next);
		// System.out.println("n4 "+n4+" data "+n4.data+" next "+n4.next);
		return n1;
	}
	
	public static void print(Node<Integer> head) {
	
		 Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
	}
	
	public static void increment(Node<Integer> head) {
		 Node<Integer> temp = head;

		    while(temp != null){
		        temp.data++;
		        temp = temp.next;
		    }
		
	}
    
	public static int length(Node<Integer> head) {
		int count = 0 ;
		Node<Integer> temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
		
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head==null) {
				head = currentNode;
			}
			else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail =  tail.next;
				}
				tail.next = currentNode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	
	public static Node<Integer> insertRec(Node<Integer> head, int ele, int pos){
		if(head == null && pos>0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(ele);
			newNode.next = head;
			return newNode;
		}else {
			head.next = insertRec(head.next,ele,pos-1);
			return head;
		}
	}
	
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		insertRec(head,20,3);
		print(head);
		
//		Node<Integer> head = createLinkedList();
//		increment(head);
//		print(head);
//		System.out.println(length(head));
	
//		Node<Integer> n1 = new Node<>(10);
//		
//		System.out.println(n1.data);
//		System.out.println(n1.next);
	}
}
