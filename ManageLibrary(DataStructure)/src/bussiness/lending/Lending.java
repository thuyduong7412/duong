package bussiness.lending;

public class Lending {
	private String bcode;
	private String rcode;
	private int state;
	
	public String getBcode() {
		return bcode;
	}
	public String getRcode() {
		return rcode;
	}
	public int getState() {
		return state;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public void setRcode(String rcode) {
		this.rcode = rcode;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	//display
	public void display() {
		System.out.format("| %10s", this.getBcode());
		System.out.format("| %20s", this.getRcode());
		System.out.format("| %11d%s%n", this.getState(),"|");
	}
}
