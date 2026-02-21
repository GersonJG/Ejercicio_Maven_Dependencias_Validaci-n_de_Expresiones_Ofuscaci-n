package umg.edu.gt.stack;

public class Stack {
	private Node top;
	
	private Node init;
	
	private int count;
	
	public Stack() {
		this.top=null;
		this.init=null;
		this.count=0;
		
	}
	
	public void push(char data) {
		Node newNode = new Node(data);	
		if (top == null) {
			top = newNode;
			init = newNode;
			
		}else {
			newNode.next = top;
			top = newNode;
		}
		count++;
	}
	
	public char pop() {
		if (isEmpty()) {
			throw new RuntimeException("La pila esta vacia");
		}
		char data = top.data;
		top = top.next;
		count--;
		return data;
	}
	
	public char peek() {
		if (isEmpty()) {
			throw new RuntimeException("La pila esta vacia");
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null; 
	}
	
	public int getcount() {
		return count;
	}
	
	public Node getNodeInit() {
		return init;
	}
	}
	


