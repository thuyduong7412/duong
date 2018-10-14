package business;

import business.MyEnum.LstDeg;
import business.MyEnum.LstPos;

public abstract class Employee implements Allowance_Salary,Comparable<Employee> {
	private int id;
	private String name;
	private float salaryRatio;

	//setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalaryRatio() {
		return salaryRatio;
	}

	public void setSalaryRatio(float salaryRatio) {
		this.salaryRatio = salaryRatio;
	}
	
	public String getDept() {
		return null;
	};
	public String getFac() {
		return null;
	};
	
	
	//constructor
	public Employee() {
		
	}
	public Employee(int id, String name, float salaryRatio) {
		super();
		this.id = id;
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	

	//sap xep
	public int compareTo(Employee tmp) {
		return this.getName().compareTo(tmp.getName());
	}

	//ghi vao file
	public abstract LstDeg getDegree();
	public abstract int getHour();
	public abstract int getDay();
	public abstract LstPos getPosition();
}
