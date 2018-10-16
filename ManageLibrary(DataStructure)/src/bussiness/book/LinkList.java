package bussiness.book;

public class LinkList {
	private DoubleNode head, tail;
	private int size;

	// constructor
	public LinkList() {
		head = tail = null;
		size = 0;
	}

	// lấy size
	public int size() {
		/*
		 * int size = 0; DoubleNode current = this.head; while (current != null) {
		 * size++; current = current.getNext(); }
		 */
		return size;
	}

	// thêm vào đầu
	public void addFirst(Book x) {
		DoubleNode node = new DoubleNode(x);
		if (size() == 0) {
			head = tail = node;
		} else {
			if (size() == 1) {
				node = new DoubleNode(x, null, head);
				head.setPrev(node);
				head = node;

				head.setNext(tail);
				tail.setPrev(head);
			} else {
				node = new DoubleNode(x, null, head);
				head.setPrev(node);
				head = node;
			}
		}
		size++;

	}

	// thêm vào đuôi
	public void addLast(Book x) {
		if (size() == 0) {
			DoubleNode node = new DoubleNode(x);
			head = tail = node;
		} else {
			if (size() == 1) {
				DoubleNode node = new DoubleNode(x, tail, null);
				tail.setNext(node);
				tail = node;

				head.setNext(tail);
				tail.setPrev(head);
			} else {
				DoubleNode node = new DoubleNode(x, tail, null);
				tail.setNext(node);
				tail = node;
			}
		}
		size++;
	}

	// lấy và xóa phần tử đầu tiên
	public Book removeFirst() {
		Book result = null;
		if (size() > 0) {
			result = head.getData();
			if (size() > 1) {
				head = head.getNext();
				head.setPrev(null);
			} else {
				head = tail = null;
			}
		}
		size--;
		return result;
	}

	// lấy và xóa phần tử cuối cùng
	public Book removeLast() {
		Book result = null;
		if (size() > 0) {
			result = tail.getData();
			if (size() > 1) {
				tail = tail.getPrev();
				tail.setNext(null);
			} else {
				head = tail = null;
			}
		}
		size--;
		return result;
	}

	// thêm 1 phần tử vào sau node thứ k (giả sử chỉ số của head i = 0)
	public void add(int k, Book b) {
		DoubleNode nodeNew = new DoubleNode(b);
		DoubleNode nodeK= this.getNode(k);
		if (nodeK == tail) {
			this.addLast(b);
			return;
		}
		if (nodeK == head) {
			this.addFirst(b);
			return;
		} else {
			nodeK.setNext(nodeNew);
			nodeNew.setNext(nodeK.getNext());
			nodeNew.setPrev(nodeK);
			nodeK.getNext().setPrev(nodeNew);
		}
		size++;
	}

	// xóa tất cả
	public void clean() {
		head = tail = null;
		size = 0;
	}

	// xóa node thứ k
	public void delete(int k) {				 // head có vị trí 0
		DoubleNode tmp = this.getNode(k);
		if (tmp == head) {
			this.removeFirst();
			size--;
			return;
		}
		if (tmp == tail) {
			this.removeLast();
			size--;
			return;
		}
		if (k < this.size() - 1 && this.size() > 2) {
			tmp.getPrev().setNext(tmp.getNext()); // trỏ phần thử thứ k-1 next tới phần tử thứ k+1
			tmp.getNext().setPrev(tmp.getNext()); // trỏ phần thử thứ k+1 previous tới phần tử thứ k-1
		}
		size--;
	}

	// lấy node thứ k & không xóa (giả sử chỉ số của head i = 0)
	public DoubleNode getNode(int k) {
		DoubleNode tmp = head;
		for (int i = 0; i < k; i++) {
			tmp = tmp.getNext();
		}
		return tmp;
	}

	// lấy data của node thứ k & không xóa (giả sử chỉ số của head i = 0)
	public Book get(int k) {
		return this.getNode(k).getData();
	}

	// tìm theo bcode
	public DoubleNode searchByBcode(String bcode) {
		DoubleNode tmp = head;
		while (tmp != null) {
			if (tmp.getData().getBcode().equalsIgnoreCase(bcode)) {
				return tmp;
			}
			tmp = tmp.getNext();
		}
		return null;
	}

	// hiển thị
	public void display() {
		DoubleNode tmp = head;
		while (tmp != null) {
			tmp.getData().display();
			System.out.println();
			tmp = tmp.getNext();
		}
	}

}
