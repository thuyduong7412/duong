package ui.managelending;

import java.util.Scanner;

import bussiness.lending.Lending;
import bussiness.lending.Queue;
import ui.managebook.BookList;
import ui.managereader.ReaderList;

public class LendingList {
	static Queue queue = new Queue();
	private static Scanner scan;

	// 3.1 Input Data
	public static void Add() {
		scan = new Scanner(System.in);		
		System.out.printf("%40s%n", "ADD A NEW LENDING");

		Lending l = new Lending();

		System.out.printf("%-10s", "Bcode: "); // sd lại SearchByBcode của LinkList
		String s = scan.nextLine();
		while (BookList.blist.searchByBcode(s) == null) {
			System.out.print("This bcode does not exist in Book List. Please enter another one: ");
			s = scan.nextLine();
		}
		l.setBcode(s);

		System.out.printf("%-10s", "Rcode: "); // sd lại SearchByRcode của Stack
		s = scan.nextLine();
		while (ReaderList.stack.searchByRcode(s) == null) {
			System.out.print("This bcode does not exist in Reader List. Please enter another one: ");
			s = scan.nextLine();
		}
		l.setRcode(s);

		System.out.printf("%-10s",
				"State (1=The book is not directed to the reader, 2=Readers have not paid, 3=Books were paid.): ");
		int n = scan.nextInt(); // state mang 3 giá trị 0,1,2

		while (n != 1 && n != 2 && n != 3) {
			System.out.print("The number entered is not valid. Please enter another one: ");
			n = scan.nextInt();
		}
		l.setState(n);

		queue.enQueue(l);
		System.out.printf("%10s%n", "ENQUEUE DONE.");
	}

	// 3.2 Display data
	public static void DisplayData() {
		System.out.format("| %10s", "BCODE");
		System.out.format("| %20s", "RCODE");
		System.out.format("| %11s%s%n", "STATE", "|");
		queue.display();
		System.out.printf("%10s%n", "DISPLAY DONE.");
		System.out.println();
	}

	// Tổng hợp
	public static void menuLending() {
		scan = new Scanner(System.in);
		String str = null;
		System.out.println("3.    LENDING LIST:");
		System.out.println("3.1      Input data");
		System.out.println("1.2.      Display data");
		System.out.print("Enter your option(3.1 or 3.2): ");
		str = scan.nextLine();
		switch (str) {
		case "3.1":
			Add();
			break;
		case "3.2":
			DisplayData();
			break;
		default:
			System.out.println("The option is not valid.");
			break;
		}

	}
}
// } while (str!="3.1" && str!="3.2" );