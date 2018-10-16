package bussiness.book;

public class DoubleNode {
	private Book data;
	private DoubleNode next;
	private DoubleNode prev;
	
	/*
	 * Get-Set		
	 */
	public Book getData() {
		return data;
	}
	public void setData(Book data) {
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
	
	public DoubleNode(Book x) {
		this.data=x;
		setNext(null);
		setPrev(null);	
	}
	public DoubleNode(Book x, DoubleNode prev, DoubleNode next) {
		this.data=x;
		setNext(null);
		setPrev(null);
	}
	
}