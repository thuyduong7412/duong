package bussiness.lending;

public class Queue {
	private DoubleNode front, rear;
	
	//constructor
	public Queue(){
		front = rear = null;
	}
	
	//KT rỗng
	public boolean isEmpty(){
		return (front==null & rear == null);
	}
	
	//thêm vào rear
	public void enQueue(Lending x) {
		DoubleNode node = new DoubleNode(x);
		if (isEmpty()) {
			front = rear = node;
		} else {
			node = new DoubleNode(x, null, rear);
			rear.setPrev(node);
			rear = node;
		}
	}
	
	// lấy và trả về front
	public Lending deQueue() {
		DoubleNode node = front;
		if (isEmpty()) {
			return null;
		} else {
			front = front.getPrev();
			front.setNext(null);
		}
		return node.getData();
	}
	
	//display
	public void display() {
		DoubleNode tmp = front;
		while (tmp != null) {
			tmp.getData().display();
			System.out.println();
			tmp = tmp.getNext();
		}
	}
}
