package business;

import business.MyEnum.LstDeg;
import business.MyEnum.LstPos;

public class Teacher extends Employee {
	private String fac;
	private LstDeg degree;
	private int hour;
	
	//contructor
	public Teacher() {
		super();
	}
	public Teacher(int i) {
		super();
		super.setId(i);
	}
	public Teacher(String fac, LstDeg degree, int hour) {
		super();
		this.fac = fac;
		this.degree = degree;
		this.hour = hour;
	}
	public Teacher(int id, String name, float salaryRatio,String fac, LstDeg degree, int hour) {
		super(id, name, salaryRatio);
		this.fac = fac;
		this.degree = degree;
		this.hour = hour;
	}
	
	public Teacher(LstDeg degree,float salaryRatio, int hour) { 			//test luong
		super();
		this.degree=degree;
		this.setSalaryRatio(salaryRatio);
		this.hour=hour;
	}
	public Teacher(String name) {		//test Ten
		super();
		super.setName(name);
	}
	
	
	//setter & getter
	public String getFac() {
		return fac;
	}
	public void setFac(String fac) {
		this.fac = fac;
	}
	
	public LstDeg getDegree() {
		return degree;
	}

	public void setDegree(LstDeg degree) {
		this.degree = degree;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	//display
	public void display() {
		System.out.printf("%-4d",this.getId());
		System.out.printf("%-20s",this.getName());
		System.out.printf("%-15s",this.getFac());	
		System.out.printf("%-15s",this.getDegree());
		System.out.printf("%-20d",this.getHour());
		System.out.printf("%-20.1f", this.getSalaryRatio());
		System.out.printf("%-15d", this.allowance());
		System.out.printf("%-15.1f%n", this.salary());
	}


	@Override
	public int allowance() { 		
		// TODO Auto-generated method stub
		switch (this.getDegree()) {
		case BACHELOR:
			return 300;
		case MASTER:
			return 500;
		case DOCTOR:
			return 1000;
		}
		return 0;
	}


	@Override
	public float salary() {
		// TODO Auto-generated method stub
		return this.getSalaryRatio()*730+ this.allowance()+this.getHour()*45;
	}
	
	//ghi vao file
	@Override
	public String getDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getDay() {
		return 0;
	}
	@Override
	public LstPos getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

}
