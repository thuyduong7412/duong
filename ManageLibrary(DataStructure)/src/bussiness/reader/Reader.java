package bussiness.reader;

public class Reader {		
	private String rcode;
	private String name;
	private int byear;
	
	public String getRcode() {
		return rcode;
	}
	public String getName() {
		return name;
	}
	public int getByear() {
		return byear;
	}
	public void setRcode(String rcode) {
		this.rcode = rcode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setByear(int byear) {
		this.byear = byear;
	}
	
	// constructor
	public Reader(String rcode, String name, int byear) {
		super();
		this.rcode = rcode;
		this.name = name;
		this.byear = byear;
	}
	public Reader() {
		super();
	}
	//display
	public void display() {
		System.out.format("| %10s", this.getRcode());
		System.out.format("| %20s", this.getName());
		System.out.format("| %11d%s%n", this.getByear(),"|");
	}
	
}
