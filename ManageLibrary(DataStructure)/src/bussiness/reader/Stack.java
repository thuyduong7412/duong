package bussiness.reader;

public class Stack {
	private DoubleNode top;		//static co sao khong?? Nếu k static thì searchByRcode k sd trong queue đc
	
	// constructor
	public Stack() {
		top = null;
	}

	// Kiểm tra Rỗng
	public boolean isEmpty() {
		return top == null;
	}

	// thêm ở top- chèn thêm 1 phần tử vào đầu dãy
	public void push(Reader r) {
		DoubleNode node = new DoubleNode(r);
		if (isEmpty()) {
			top = node;
		} else {
			node = new DoubleNode(r, null, top);
			top = node;
		}
	}

	// trả vể data của head(k xóa)
	public Reader peek() {
		if (!isEmpty()) {
			return top.getData();
		}
		return null;
	}

	// lấy ở head- lấy data phần tử đầu tiên và xóa
	public Reader pop() {
		DoubleNode node = top;
		if (isEmpty()) {
			System.out.println("Nothing to POP.");
			return null;
		} else {
			if (top.getNext() == null) {
				top = null;
			} else {
				top = top.getNext();
				top.setPrev(null);
			}
		}
		return node.getData();
	}

	// display
	public void display() {
		DoubleNode tmp = top;
		while (tmp != null) {
			tmp.getData().display();
			tmp = tmp.getNext();
		}
	}

	// tìm theo rcode			//sai
	public DoubleNode searchByRcode(String rcode) {
		DoubleNode tmp = top;
		while (tmp != null) {
			if (tmp.getData().getRcode().equalsIgnoreCase(rcode)) {
				return tmp;
			}
			tmp = tmp.getNext();
		}
		return null;
	}

	// Xóa bằng rcode
	public void deleteByRcode(String rcode) {
		if (!isEmpty()) {
				Stack stack2 = new Stack();
				DoubleNode tmp = this.top;
				while (tmp.getNext().getData().getRcode() != rcode) { // null có vấn đề //tim k co thi sao
					stack2.push(this.pop());
					tmp = tmp.getNext();
					if (tmp == null) break;
				}
				if(tmp != null) {
					this.pop();
				}
				tmp = stack2.top;
				while (tmp.getNext() != null) {
					this.push(stack2.pop());
					tmp = tmp.getNext();
				}
		} else {
			// isEmpty thì k làm gì
		}
	}

}

// push
// if (size() == 0) {
// DoubleNode node= new DoubleNode(r);
// head = tail = node;
// } else {
// DoubleNode node = new DoubleNode(r, null, head);
// head.setPrev(node);
// head = node;
// }
