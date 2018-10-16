package ui.managereader;

import java.util.Scanner;

import bussiness.reader.DoubleNode;
import bussiness.reader.Reader;
import bussiness.reader.Stack;

public class ReaderList {
	public static Stack stack = new Stack();
	// Scanner scan = new Scanner(System.in);
	
	private static Scanner scan;

	// 2.1. Add reader
	public static void inputAdd() {
		scan = new Scanner(System.in);
		Reader r = new Reader();
		System.out.printf("%40s%n", "ADD A NEW READER");
		System.out.printf("%-10s", "Name: ");
		r.setName(scan.nextLine());

		do {
			System.out.printf("%-10s", "rcode (only single): "); // đơn nhất
			r.setRcode(scan.nextLine());
		} while (stack.searchByRcode(r.getRcode()) != null);

		do {
			System.out.printf("%-10s", "Byear (1900-2010): "); // năm sinh 1900 đến 2010
			r.setByear(scan.nextInt());
		} while (r.getByear() < 1900 || r.getByear() > 2010);

		stack.push(r);
		System.out.println("ADD DONE.");
		// scan.close();
	}

	// 2.2. Display data
	public static void displayStack() {
		System.out.format("|   %-2s", "RCODE   ");
		System.out.format("|         %-12s", "NAME");
		System.out.format("|     %-2s%n", "BYEAR  |");
		stack.display();
		System.out.println("DISPLAY DONE.");
	}

	// 2.3. Search by rcode
	public static void searchByRcode() {
		System.out.format("%20s%n", "SERCH BY RCODE");
		System.out.print("Enter rcode: ");
		scan = new Scanner(System.in);
		String str = scan.nextLine(); // tại sao nuốt luôn scan ???
		// str= scan.nextLine(); // ???
		DoubleNode node = stack.searchByRcode(str);
		if (node != null) {
			System.out.format("|   %-2s", "RCODE   ");
			System.out.format("|         %-12s", "NAME");
			System.out.format("|     %-2s%n", "BYEAR  |");
			node.getData().display();
		} else {
			System.out.println("Not found this reader.");
		}
		System.out.println("SEARCH DONE.");
		// input.close();
	}

	// 2.4. Delete by rcode
	public static void deleteByRcode() {
		System.out.printf("%20s%n", "DELETE BY RCODE");
		System.out.print("Enter rcode: ");
		scan = new Scanner(System.in);
		String str = scan.nextLine();
		stack.deleteByRcode(str);
		System.out.println("DELETE DONE.");
	}

	// Tổng hợp để test thử
	public static void menuReader() {
		scan = new Scanner(System.in);
		String str = null;

		System.out.println("1.    READER LIST:");
		System.out.println("2.1.      Add reader");
		System.out.println("2.2.      Display data");
		System.out.println("2.3.      Search by rcode");
		System.out.println("2.4.      Delete by rcode");
		System.out.print("Enter your option(from 2.1 to 2.4): ");
		str = scan.nextLine();
		switch (str) {
		case "2.1":
			inputAdd();
			break;
		case "2.2":
			displayStack();
			break;
		case "2.3":
			searchByRcode();
			break;
		case "2.4":
			deleteByRcode();
			break;
		default:
			System.out.println("The option is not valid.");
			break;
		}

	}

}
// } while (str!="2.1" && str!="2.2" && str!="2.3" && str!="2.4");