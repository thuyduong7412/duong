package business;

import business.MyEnum.LstDeg;
import business.MyEnum.LstPos;

public class Staff extends Employee {
	private String dept;
	private LstPos position;
	private int day;
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}

	public LstPos getPosition() {
		return position;
	}

	public void setPosition(LstPos position) {
		this.position = position;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	//constructor
	public Staff() {
		super();
	}
	public Staff(int i) {
		super();
		super.setId(i);
	}
	public Staff(int id, String name, float salaryRatio,String dept, LstPos position, int day) {
		super(id, name, salaryRatio);
		this.dept = dept;
		this.position = position;
		this.day = day;
	}
	public Staff(LstPos position,float salaryRatio, int day) { 			//test luong
		super();
		this.position = position;
		this.setSalaryRatio(salaryRatio);
		this.day= day;
	}
	public Staff(String name) {		//test Ten
		super();
		super.setName(name);
	}
	public Staff(String dept, LstPos position, int day) {   //test Phong
		super();
		this.dept = dept;
		this.position = position;
		this.day = day;
	}
	//display
	public void display() {
		System.out.printf("%-4d",this.getId());
		System.out.printf("%-20s",this.getName());
		System.out.printf("%-15s",this.getDept());	
		System.out.printf("%-15s",this.getPosition());
		System.out.printf("%-20d",this.getDay());
		System.out.printf("%-20.1f", this.getSalaryRatio());
		System.out.printf("%-15d", this.allowance());
		System.out.printf("%-15.1f%n", this.salary());
	}

	@Override
	public int allowance() {
		// TODO Auto-generated method stub
		int x=0;
		switch (this.getPosition()) {
		case HEAD:
			x=2000;
			break;
		case VICE_HEAD:
			x=1000;
			break;
		case STAFF:
			x=1000;
			break;
		}
		return x;
	}

	@Override
	public float salary() {
		return this.getSalaryRatio()*730+ this.allowance()+this.getDay()*30;
	}

	//ghi vao file
	@Override
	public String getFac() {
		return dept;
	}
	@Override
	public LstDeg getDegree() {
		return null;
	}
	@Override
	public int getHour() {
		return day;
	}
}
