
public class ArrayQueue implements QueueInterface{
	private int front;
	private int rear;
	private int size;
	private DynamicArray Queue;
	
	ArrayQueue(){
		front = 0;
		rear = 0;
		size = 0;
		Queue = new DynamicArray();
	}
	
	public void enqueue(int value) {
		//add stuff here
		Queue.add(value, this.getClass().getName());
	}
	
	public int dequeue() {
		int deqValue = 0;
		if (Queue.size() > 0) {
			deqValue = Queue.getStartValue();
			Queue.removeFront();
		}
		
		return deqValue;//change this 
	}
	
	public int peek() {
		return Queue.getStartValue();//change this 
	}
	
	public boolean isEmpty() {
		if (Queue.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return Queue.size();//change this
	}
	
	public void clear() {
		Queue.clear();
	}
	
	public String toString() {
		return Queue.toString();
	}
	
	public void displayArray() {
		Queue.displayArray();
	}
	
	void displayFrontRearSize() {
		Queue.displayFrontRearSize();
	}
}
