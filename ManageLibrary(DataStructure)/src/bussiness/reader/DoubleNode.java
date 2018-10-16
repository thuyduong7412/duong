package bussiness.reader;

// Câu hỏi: Có cách nào không cần tạo DoubleNode mới với kiểu dữ liệu khác mà vẫn sử dụng được linklist đã tạo hay không?
public class DoubleNode {
	private Reader data;
	private DoubleNode next;
	private DoubleNode prev;
	
	/*
	 * Get-Set		
	 */
	public Reader getData() {
		return data;
	}
	public void setData(Reader data) {
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
	public DoubleNode(Reader x) {
		this.data=x;
		setNext(null);
		setPrev(null);	
	}
	public DoubleNode(Reader x, DoubleNode prev, DoubleNode next) {
		this.data=x;
		setNext(null);
		setPrev(null);
	}
	
}

/*
 * 	set-get cho từng thuộc tính của Book		 //coi lại
 */
// đoạn này chưa chắc đúng		// như thế này thì k private cho các thuộc tính bên Book đc k?
/*public String getRcode() {
	return getRcode();
}
public String getName() {
	return getName();
}
public int getByear() {
	return getByear();
}
public void setRcode(String rcode) {
	this.setRcode(rcode);;
}
public void setName(String name) {
	this.setName(name);
}
public void setByear(int byear) {
	this.setByear(byear);
}*/
