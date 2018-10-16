package bussiness.book;

public class Book {
	private String bcode;
	private String title;
	private int quantity;
	private int lended;
	private double price;
	
	//setter getter
	public String getBcode() {
		return bcode;
	}
	public String getTitle() {
		return title;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getLended() {
		return lended;
	}
	public double getPrice() {
		return price;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setLended(int lended) {
		this.lended = lended;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// constructor
	public Book(String bcode, String title, int quantity, int lended, double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.quantity = quantity;
		this.lended = lended;
		this.price = price;
	}
	public Book() {
		
	}
	
	//display
	public void display() {
		System.out.format("| %-10s", this.getBcode());
		System.out.format("| %-20s", this.getTitle());
		System.out.format("| %-10d", this.getQuantity());
		System.out.format("| %-10d", this.getLended());
		System.out.format("| %-10s", this.getPrice());
	}
	
}
