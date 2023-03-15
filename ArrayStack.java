//front = bottom of stack, rear = top of stack 
public class ArrayStack implements StackInterface{
	private DynamicArray Stack;
	
	ArrayStack(){
		Stack = new DynamicArray();
	}
	
	public void push(int value) {
		Stack.add(value, this.getClass().getName());
	}
	
	public int pop() {
		int popVal = Stack.getEndValue();
		Stack.removeRear();
		
		return popVal;
	}
	
	public int peek() {
		return Stack.getEndValue(); 
	}
	
	public boolean isEmpty() {
		if (this.Stack.size() == 0) {
			return true;
		}
		
		return false;
	}
	
	public int size() {
		return this.Stack.size();//change this 
	}
	
	public void clear() {
		this.Stack.clear();
	}
	
	public String toString() {
		return this.Stack.toString();
	}
	
	void printArray() {
		this.Stack.displayArray();
	}
	
	void displayFrontRearSize() {
		Stack.displayFrontRearSize();
	}
}
