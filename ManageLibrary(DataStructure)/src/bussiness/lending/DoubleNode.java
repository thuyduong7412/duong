package bussiness.lending;

// Câu hỏi: Có cách nào không cần tạo DoubleNode mới với kiểu dữ liệu khác mà vẫn sử dụng được linklist đã tạo hay không?
public class DoubleNode {
	private Lending data;
	private DoubleNode next;
	private DoubleNode prev;
	
	/*
	 * Get-Set		
	 */
	public Lending getData() {
		return data;
	}
	public void setData(Lending data) {
		this.data = data;
	}
	public DoubleNode getNext() {
		return next;
	}
	public void setNext(DoubleNode next) {
		this.next = next;
	}
	public DoubleNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}
	
	/*
	 * Constructor
	 */
	public DoubleNode() {
		
	}
	public DoubleNode(Lending x) {
		this.data=x;
		setNext(null);
		setPrev(null);	
	}
	public DoubleNode(Lending x, DoubleNode prev, DoubleNode next) {
		this.data=x;
		setNext(null);
		setPrev(null);
	}
	
}
