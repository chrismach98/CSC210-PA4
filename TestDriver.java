
public class TestDriver {
	public static void main (String[] args) {
		DynamicArray a = new DynamicArray();
		ListStack l = new ListStack();
		LinkedList linkedL = new LinkedList();
		ListStack lStack = new ListStack();
		ListQueue lQueue = new ListQueue();
		ArrayStack aStack = new ArrayStack();
		ArrayQueue aQueue = new ArrayQueue();
		
		
		/*for(int i = 0; i < 2; i++) {
			//populate whatever data struct you're testing here 
			aStack.push(i);
		}*/
		
		lStack.push(7);
		lStack.push(11);
		lStack.push(4);
		lStack.push(21);
		lStack.push(2);
		lStack.push(2000000);
		
		System.out.println(lStack.toString());
		
		System.out.println(lStack.pop());
		
		System.out.println(lStack.toString());
		
	}
	
}
