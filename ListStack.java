//head = bottom of stack, tail = top of stack
public class ListStack implements StackInterface{
	private LinkedList stack; 
	
	ListStack(){
		stack = new LinkedList();
	}
	
	public void push(int value) {
		this.stack.addLast(value);
	}
	
	public int pop() {
		int poppedVal = stack.getTailVal();
		this.stack.removeLast();
		
		return poppedVal; 
	}
	
	public int peek() {
		return this.stack.getTailVal(); 
	}
	
	public boolean isEmpty() {
		if (this.stack.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.stack.size(); 
	}
	
	public void clear() {
		int iterationSize = this.stack.size();
		for (int i = 0; i < iterationSize; i++) {
			this.stack.removeLast();
		}
	}
	
	public String toString() {
		return this.stack.toString();
	}
}
