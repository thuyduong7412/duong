package ui;

import java.util.ArrayList;
import java.util.Scanner;

import business.Employee;

public class Add {
	static Scanner scan= new Scanner(System.in);
	//button add
		public static ArrayList<Employee> button_add(ArrayList<Employee> emp) {
			System.out.print("Do you want to creat a Staff or a Teacher( enter s for Staff, otherwise for Teacher): ");
			switch (scan.nextLine()) {
			case "s":
				emp.add(Input.inputStaff());
				break;
			default :
				emp.add(Input.inputTeacher());
				break;
			}
			return emp;
		}
}
