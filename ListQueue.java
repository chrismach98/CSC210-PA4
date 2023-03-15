//head = front of queue, tail = back of queue
public class ListQueue implements QueueInterface {
	private LinkedList Queue;
	
	ListQueue(){
		Queue = new LinkedList();
	}
	
	public void enqueue(int value) {
		this.Queue.addLast(value);
	}
	
	public int dequeue() {
		int deqValue = this.Queue.getHeadVal();
		this.Queue.removeFirst();
		
		return deqValue;
	}
	
	public int peek() {
		return this.Queue.getHeadVal();
	}
	
	public boolean isEmpty() {
		if(this.Queue.size() == 0) {
			return true;
		}
		
		return false;
	}
	
	public int size() {
		return this.Queue.size();//change this 
	}
	
	public void clear() {
		int iterationSize = this.Queue.size();
		
		for (int i = 0; i < iterationSize; i++) {
			this.Queue.removeLast();
		}
	}
	
	public String toString() {
		return this.Queue.toString();
	}
}
