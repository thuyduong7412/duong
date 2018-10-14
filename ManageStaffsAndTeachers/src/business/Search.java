package business;

import java.util.ArrayList;
import java.util.Scanner;

import ui.Menu;

public class Search {		
	static Scanner scan= new Scanner(System.in);
	//tim kiem theo ten
	public static void searchName(ArrayList<Employee> emp) {
		System.out.println("Enter name to search ");
		String name= scan.nextLine();
		ArrayList<Employee> result =Sname(emp,name); // tim name trong arraylist emp
		if (result.size()!=0) {
			Menu.displayTitle();
			for(Employee e: result) {
				e.display();
			}
		}else {
			System.out.println("Can not search anyone");
		} 
	}
			//ham con- tim ten name trong arraylist emp (test ten)
			public static ArrayList<Employee> Sname(ArrayList<Employee> emp, String name) {
				ArrayList<Employee> result=new ArrayList<Employee>();
				for (Employee e :emp) {
					if ( e.getName().equalsIgnoreCase(name) || e.getName().contains(name) ) {
						result.add(e);
					}
				}
				return result;
			}
	
	//tim kiem theo khoa/phong ban
	public static void searchFac_Dept(ArrayList<Employee> emp) {
		System.out.print("Enter Faculty or Department to search: ");
		String dept;
		dept= scan.nextLine();
		ArrayList<Employee> result =Sdept(emp,dept);	 // tim dept trong arraylist emp
		if (result.size()!=0) {
			Menu.displayTitle();
			for(Employee e: result) {
				e.display();
			}
		} else {
			System.out.println("Can not search anyone");
		}
	}
			/*
			 * phuong thuc con: tim department/faculty trong arrayList emp
			 */
			public static ArrayList<Employee> Sdept(ArrayList<Employee> emp, String dept) {
				ArrayList<Employee> result=new ArrayList<Employee>();
				for (Employee e :emp) {
					if (e.getFac().equalsIgnoreCase(dept) || e.getDept().equalsIgnoreCase(dept)) {
						result.add(e);
					}
				}
				return result;
			}
}

//int count=0;
//Menu.displayTitle();
//for (Employee e :emp) {
//	if (e.getFac().equalsIgnoreCase(dept) || e.getDept().equalsIgnoreCase(dept)) {
//		e.display();
//	} else {
//		count++;
//	}
//}
//if (count==emp.size()) {
//	System.out.println("Can not search anyone");
//} 