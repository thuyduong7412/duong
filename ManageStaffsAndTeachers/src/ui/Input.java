package ui;

import java.util.Scanner;

import business.Staff;
import business.Teacher;
import business.MyEnum.*;


public class Input {
	static Scanner scan= new Scanner(System.in);
	static int ids=1;
	
	//input cac List enum
	public static LstPos inputPos() {
		int n=0;
		while(true) {
			try {
				do {
					n= Integer.parseInt(scan.nextLine());
					switch (n) {
					case 1:
						return LstPos.HEAD;
					case 2:
						return LstPos.VICE_HEAD;
					case 3:
						return LstPos.STAFF;
					default:
						System.out.println("Please enter a valid number.");
					}
				} while (n!=1 && n!=2 && n!=3);
			} catch (Exception e) {
					System.out.println("Please enter a valid number.");
			}
		}
	}
	public static LstDeg inputDeg() {
		int n=0;
		while(true) {
			try {
				do {
					n=Integer.parseInt(scan.nextLine());
					switch (n) {
					case 1:
						return LstDeg.BACHELOR;
					case 2:
						return LstDeg.MASTER;
					case 3:
						return LstDeg.DOCTOR;
					default:
						System.out.println("Please enter a valid number.");
					}
				} while (n!=1 && n!=2 && n!=3);
			} catch(Exception e) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
	
	//input cac thuoc tinh khac
	public static String inputName() {
		return scan.nextLine();
	}
	public static float inputSalaryRatio() {
		while(true) {
			try {
				return Float.parseFloat(scan.nextLine());
			}
			catch(Exception e) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
	public static String inputFac() {
		return scan.nextLine();
	}
	public static int inputHour() {
		while(true) {
			try {
				return Integer.parseInt(scan.nextLine());
			}
			catch(Exception e) {
				System.out.println("Please enter a valid number.");
			}
		}
	}
	public static String inputDept() {
		return scan.nextLine();
	}
	
	public static int inputDay() {
		int x=0;
		while(true) {
			try {
				x= Integer.parseInt(scan.nextLine());
				while(x>31||x<0) {
					System.out.println("This is not the number of days in a month. Please enter a valid number.");
					x= Integer.parseInt(scan.nextLine());
				}
				return x;
			}
			catch(Exception e) {
				System.out.println("This is not the number of days in a month. Please enter a valid number.");
			}
		}
	}
		
	// input cho hai lop con
	public static Staff inputStaff() {
			Staff st= new Staff(ids);
			System.out.print("Name: ");
			st.setName( inputName() );
			System.out.print("Salary ratio: ");
			st.setSalaryRatio(inputSalaryRatio());
			System.out.print("Department: ");
			st.setDept(inputDept());
			System.out.print("Position (1=HEAD; 2=VICE HEAD; 3=STAFF): ");
			st.setPosition(inputPos());
			System.out.print("Number of working days: ");
			st.setDay(inputDay());
			ids++;
			return st;
		}
	public static Teacher inputTeacher() {
			Teacher te= new Teacher(ids);
			System.out.print("Name: ");
			te.setName(inputName());
			System.out.print("Salary ratio: ");
			te.setSalaryRatio(inputSalaryRatio());
			System.out.print("Faculty: ");
			te.setFac(inputFac());
			System.out.print("Degree (1=BACHELOR; 2=MASTER; 3=DOCTOR): ");
			te.setDegree(inputDeg());
			System.out.print("Number of teaching hours: ");
			te.setHour(inputHour());
			ids++;
			return te;
		}
}
