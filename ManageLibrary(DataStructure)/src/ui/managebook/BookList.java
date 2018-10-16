package ui.managebook;

import java.util.Scanner;

import bussiness.book.Book;
import bussiness.book.DoubleNode;
import bussiness.book.LinkList;

public class BookList {
	public static LinkList blist = new LinkList();
	static Scanner scan = new Scanner(System.in);

	// 1.1 Input & add to the end
	public static void inputAdd2End() {
		scan = new Scanner(System.in);
		Book b = new Book();
		System.out.println();
		System.out.printf("%40s%n", "ADD A NEW BOOK TO THE END");
		System.out.printf("%10s", "Title: ");
		b.setTitle(scan.nextLine());

		do {
			System.out.printf("%10s", "bcode (only single): "); // vì đơn nhất nên k được trùng với các bcode trước đó
			b.setBcode(scan.nextLine());
		} while (blist.searchByBcode(b.getBcode()) != null);

		System.out.printf("%10s", "Quantity: ");
		b.setQuantity(scan.nextInt());

		do {
			System.out.printf("%10s", "Lended (Lender <= Quantity): "); // không được lớn hơn quantity
			b.setLended(scan.nextInt());
		} while (b.getLended() > b.getQuantity());

		System.out.printf("%10s", "Price: ");
		b.setPrice(scan.nextDouble());
		blist.addLast(b);
		System.out.println("  ADD DONE.");
	}

	// 1.2 Display data
	public static void displayData() {

		System.out.println();
		System.out.format("| %-10s", "Code");
		System.out.format("| %-20s", "Title");
		System.out.format("| %-10s", "Quantity");
		System.out.format("| %-10s", "Lended");
		System.out.format("| %-10s", "Price");
		System.out.format("| %-10s%n", "Value");
		System.out.println("---------------------------------------------------------------------------");

		double value;
		for (int i = 0; i < blist.size(); i++) {
			blist.get(i).display();
			value = blist.get(i).getPrice() * blist.get(i).getQuantity();
			System.out.format("| %-10s%n", value);
		}
		System.out.println("  DISPLAY DONE.");
	}

	// 1.3 Search by bcode
	public static Boolean searchByBcode() { // nếu tìm k có thì sao //tìm thấy thì in ra
		System.out.format("%20s%n", "SERCH BY BCODE");
		System.out.print("Enter bcode:");
		scan = new Scanner(System.in);
		String str = scan.nextLine(); // tại sao nuốt luôn scan ???
		DoubleNode b = blist.searchByBcode(str);
		if (b != null) {
			b.getData().display();
			System.out.println();
			System.out.println("SEARCH DONE.");
			return true;
		}

		System.out.println("Not found this book.");
		System.out.println("SEARCH DONE.");
		return false;

	}

	// 1.4 Input & add to the beginning
	public static void inputAdd2Begin() {
		scan = new Scanner(System.in);
		Book book = new Book();
		System.out.println();
		System.out.printf("%40s%n", "ADD A NEW BOOK TO BEGINNING");
		System.out.printf("%10s", "Title: ");
		book.setTitle(scan.nextLine());

		do {
			System.out.printf("%10s", "bcode (only single): "); // vì đơn nhất nên k được trùng với các bcode trước đó
			book.setBcode(scan.nextLine());
		} while (blist.searchByBcode(book.getBcode()) != null);

		System.out.printf("%10s", "Quantity: ");
		book.setQuantity(scan.nextInt());

		do {
			System.out.printf("%10s", "Lended (Lender <= Quantity): ");
			book.setLended(scan.nextInt()); // không được lớn hơn quantity
		} while (book.getLended() > book.getQuantity());

		System.out.printf("%10s", "Price: ");
		book.setPrice(scan.nextDouble());
		blist.addFirst(book);
		System.out.println("  ADD DONE.");
	}

	// 1.5 Add after position k // điều kiện nhập k là 0<k<N, báo lỗi các trường hợp
	// còn lại
	public static void add() {
		scan = new Scanner(System.in);
		System.out.println();
		System.out.printf("%20s%n", "ADD AFTER TO POSITON k");

		System.out.print("Enter k: ");
		int k = scan.nextInt();
		while (k < 0 || k >= blist.size()) {
			System.out.print("Re-enter k (conditon: k>=0 & k<length): ");
			k = Integer.parseInt(scan.next());
		}

		Book b = new Book();
		System.out.printf("%10s", "Title: ");
		b.setTitle(scan.nextLine());

		do {
			System.out.printf("%10s", "bcode (only single): "); // vì đơn nhất nên k được trùng với các bcode trước đó
			b.setBcode(scan.nextLine());
		} while (blist.searchByBcode(b.getBcode()) != null);

		System.out.printf("%10s", "Quantity: ");
		b.setQuantity(scan.nextInt());

		do {
			System.out.printf("%30s", "Lended(Lender <= Quantity): "); // không được lớn hơn quantity
			b.setLended(scan.nextInt());
		} while (b.getLended() > b.getQuantity());

		System.out.printf("%10s", "Price: ");
		b.setPrice(scan.nextDouble());
		blist.add(k, b);
		System.out.println("  ADD DONE.");
	}

	// 1.6 Delete position k
	public static void delete() { // điều kiện của k
		scan = new Scanner(System.in);
		System.out.printf("%15s%n", "DELETE POSITION K");
		System.out.print("Enter k: ");
		int k = scan.nextInt();
		while (k < 0 || k >= blist.size()) {
			System.out.print("Re-enter k (conditon: k>=0 & k<length): ");
			k = Integer.parseInt(scan.next());
		}
		blist.delete(k);
		System.out.println("  DELETE DONE.");
	}

	// Tổng hợp vào menu
	public static void menuBook() {
		scan = new Scanner(System.in);
		String str = null;

		System.out.println("1.    BOOK LIST:");
		System.out.println("1.1      Input & add to the end");
		System.out.println("1.2.      Display data");
		System.out.println("1.3.      Search by bcode");
		System.out.println("1.4.      Input & add to beginning");
		System.out.println("1.5.      Add after position  k");
		System.out.println("1.6.      Delete position k");
		System.out.print("Enter your option(from 1.1 to 1.6): ");
		str = scan.nextLine();
		switch (str) {
		case "1.1":
			inputAdd2End();
			break;
		case "1.2":
			displayData();
			break;
		case "1.3":
			searchByBcode();
			break;
		case "1.4":
			inputAdd2Begin();
			break;
		case "1.5":
			add();
			break;
		case "1.6":
			delete();
			break;
		default:
			System.out.println("The option is not valid.");
			break;
		}
	}
}

// } while (str!="1.1" && str!="1.2" && str!="1.3" && str!="1.4" && str!="1.5"
// && str!="1.6" );
