
public class DynamicArray {
	private int[] array;
	private int size;
	private int start;
	private int end;
	private int front;
	private int rear;
	private static final int DEFAULT_CAPACITY = 3;
	
	DynamicArray(){
		array = new int [DEFAULT_CAPACITY];
		size = 0;
		start = 0;
		end = 0;
		front = 0;
		rear = 0;
	}
	
	void add(int value, String name) {
		//change end back to size if this doesn't work 
		
		/*if (end >= array.length) {
			resize(2*array.length);
		}
		array[end] = value;
		end++;
		size++;*/
		
		if (this.size >= this.array.length) {
			resize(2*this.array.length);
		}
		
		array[rear] = value;
		rear = name.equalsIgnoreCase("ArrayQueue") ? (rear + 1) % this.array.length:rear + 1;
		//rear = (rear + 1) % this.array.length;
		size++;
		
	}
	
	void resize(int capacity) {
		/*int[] temp = new int[capacity];
		this.size = capacity < this.size ? capacity:this.size;
		for (int i = 0; i < this.size; i++) {
			temp[i] = this.array[i];
		}
		this.array = temp;
		end = size;*/
		
		int[] temp = new int[capacity];
		this.size = capacity < this.size ? capacity:this.size;
		int n = this.front;
		
		for (int i = 0; i < this.size; i++) {
			temp[i] = this.array[n];
			n++;
			if (n >= this.array.length) {
				n = 0;
			}
		}
		
		this.front = 0;
		this.rear = this.front + this.size;
		
		this.array = temp;
		
	}
	
	void remove(int index) {
		int[] temp = new int[this.array.length - 1];
		for (int i = 0; i < this.array.length; i++) {
			if(i != index) {
				temp[i] = this.array[i];
			}
		}
		
		this.array = temp;
		this.size--;
	}
	
	void removeRear() {
		this.rear--;
		this.size--;
	}
	
	void removeFirst() {
		this.start++;
		this.size--;
	}
	
	void removeFront() {
		this.front++;
		this.size--;
		
		if (this.front >= this.array.length) {
			this.front = 0;
		}
	}
	
	int size() {return this.size;}
	
	int get(int index) {
		return this.array[this.start + index];
	}
	
	int getLength() { //for testing
		return this.array.length;
	}
	
	public String toString() {
		int n = this.front;
		String str = "{";
		
		
		/*for (int i = this.start; i < this.end; i++) {
			if (i == (this.end - 1)) {
				str += array[i];
			}
			else {
				str += array[i] + " ";
			}
		}*/
		
		for (int i = 0; i < this.size; i++) {
			str += i == this.size - 1 ? this.array[n]:this.array[n] + " ";
			n++;
			if (n >= this.array.length) {
				n = 0;
			}
		}
		
		return str + "}";
	}
	
	int getStartValue() {
		return this.array[front];
	}
	
	int getEndValue() {
		return this.array[rear];
	}
	
	void clear() {
		this.front = 0;
		this.rear = 0;
		this.size = 0;
	}
	
	void displayArray() {
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(this.array[i] + " ");
		}
		System.out.println();
	}
	
	void displayFrontRearSize() {
		System.out.println("Front: "+front+" Rear: "+ rear+" size: "+size);
	}
}
