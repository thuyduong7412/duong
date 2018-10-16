package manage;

public class MyFile {
	private String name;
	private long size;
	private String fullPath;
	
	/*
	 * getter-setter
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	
	/*
	 * constructor
	 */
	protected MyFile() {
		super();
	}
	
	public MyFile(String name, long size, String fullPath) {
		super();
		this.name = name;
		this.size = size;
		this.fullPath = fullPath;
	}
	/*
	 * display
	 */
	public void display() {
		System.out.format("|%-20s",this.getName());
		System.out.format("|%-10s", this.getSize());
		System.out.format("|%-50s%n", this.getFullPath());
	}
}
