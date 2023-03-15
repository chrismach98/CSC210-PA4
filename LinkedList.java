
public class LinkedList {
	private class Node{
		private int data;
		private Node next;
		
		Node (int d){
			this.data = d;
			this.next = null;
		}
		
		
	}
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public void addLast(int n) {
		Node NewNode = new Node(n);
		size++;
		
		if (this.head == null) {
			this.head = NewNode;
			this.tail = NewNode;
		}
		else {
			this.tail.next = NewNode;
			this.tail = NewNode;
		}
	}
	
	public int getLast() {
		return this.tail.data;
	}
	
	public int get(int index) {
		Node current = this.head;
		
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		
		return current.data;
	}
	
	public void removeLast() {
		if (this.head.equals(this.tail)) {
			this.head = null;
			this.tail = null;
		}
		
		else {
			Node current = this.head;
			
			while(current.next.next != null) {
				current = current.next;
			}
			
			current.next = null;
			tail = current;
		}
		
		size--;
	}
	
	public void removeFirst() {
		if(this.head.equals(this.tail)) {
			this.head = null;
			this.tail = null;
		}
		else {
			Node oldHead = this.head;
			this.head = oldHead.next;
			oldHead.next = null;
		}
		
		size--;
	}
	
	public boolean equals(Object obj) {
		
		return false;
	}
	
	public String toString() {
		String str = "{";
		Node current = this.head;
		
		while(current != null) {
			if (current.next != null) 
				str += current.data + " ";
			else
				str += current.data;
			current = current.next;
		}
		
		return str + "}";
	}
	
	public int size() {
		return this.size;
	}
	
	public void printList() { //for testing
		Node current = this.head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public int getHeadVal() { //for testing 
		return this.head.data;
	}
	
	public int getTailVal() { //for testing 
		
		return this.tail.data;
	}
	
}


