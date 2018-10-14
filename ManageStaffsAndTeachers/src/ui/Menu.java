package ui;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

import business.Employee;
import business.Search;
import business.Sort;
import entity.Text;
//import entity.Text;

public class Menu {
	static ArrayList<Employee> emp = new ArrayList<Employee>();
	static Scanner scan= new Scanner(System.in);
	
	//display title
		public static void displayTitle() {
			System.out.printf("%-100s%n","RESULT: ");
			System.out.printf("%-4s","ID");
			System.out.printf("%-20s","NAME");
			System.out.printf("%-15s","FAC/DEPT");	
			System.out.printf("%-15s","DEG/POS");
			System.out.printf("%-20s","T.HOURS/W.DAYS");
			System.out.printf("%-20s", "SAL RATIO");
			System.out.printf("%-15s", "ALLOWANCE");
			System.out.printf("%-15s%n","SALARY");	
		}
	//Display all
	public static void buttonDisplay() {
		displayTitle();
		for(Employee e:emp) {
			e.display();
		}
	}
	//menu
	public static void menu() throws FileNotFoundException {
		int n=0;
		while(true) {
				try {
					do {
						System.out.println("Universary Staff Manegement");
						System.out.println("        1.Add Staff");
						System.out.println("        2.Display all employee");
						System.out.println("        3.Search staff by name");
						System.out.println("        4.Search staff by depatment/faculty");
						System.out.println("        5.Display all Teacher");
						System.out.println("        6.Save this employee list to a file-'text.txt' ");
						System.out.println("        7.Exit");
						System.out.print("     Select function (1,2,3,4,5,6 or 7): ");
						n=Integer.parseInt(scan.nextLine());
						switch(n) {
						case 1:
							Add.button_add(emp);
							break;
						case 2:
							Menu.buttonDisplay();
							break;
						case 3:
							Search.searchName(emp);
							break;
						case 4:
							Search.searchFac_Dept(emp);
							break;
						case 5:
							Sort.sort(emp);
							break;
						case 6:
							Text.write(emp);
							break;
						case 7:
							System.out.println("                                ***END***                               ");
							scan.close();
							break;
						default:
							System.out.println("Invalid. Re-enter! ");
						}
						} while( n != 7 );
						break;
					}
				catch(Exception e) {
					System.out.println("Please enter a valid number.");
				}
		}
	}
}