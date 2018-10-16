package ui;

import java.util.Scanner;

import ui.managebook.BookList;
import ui.managelending.LendingList;
import ui.managereader.ReaderList;

public class Menu {
	public static void menu() {
		System.out.println("------------------------LIBRARY MANAGE SYSTEM--------------------------");
		System.out.println();
		System.out.printf("%47s%n", "***********START**********");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String choice;
		boolean repeat = true;
		do {
			System.out.println("Which item would you like to manage?");
			System.out.println("1.    BOOK LIST:");
			System.out.println("1.1      Input & add to the end");
			System.out.println("1.2.      Display data");
			System.out.println("1.3.      Search by bcode");
			System.out.println("1.4.      Input & add to beginning");
			System.out.println("1.5.      Add after position  k");
			System.out.println("1.6.      Delete position k");
			System.out.println();
			System.out.println("2.    READER LIST:");
			System.out.println("2.1.      Add reader");
			System.out.println("2.2.      Display data");
			System.out.println("2.3.      Search by rcode");
			System.out.println("2.4.      Delete by rcode");
			System.out.println();
			System.out.println("3.    LENDING LIST:");
			System.out.println("3.1      Input data");
			System.out.println("1.2.      Display data");
			System.out.println();
			System.out.println("4.EXIT");
			System.out.println("Enter your option: ");
			choice = scan.nextLine();
			switch (choice) {
			case "1":
				BookList.menuBook();
				break;
			case "1.1":
				BookList.inputAdd2End();
				break;
			case "1.2":
				BookList.displayData();
				break;
			case "1.3":
				BookList.searchByBcode();
				break;
			case "1.4":
				BookList.inputAdd2Begin();
				break;
			case "1.5":
				BookList.add();
				break;
			case "1.6":
				BookList.delete();
				break;
			case "2":
				ReaderList.menuReader();
			case "2.1":
				ReaderList.inputAdd();
				break;
			case "2.2":
				ReaderList.displayStack();
				break;
			case "2.3":
				ReaderList.searchByRcode();
				break;
			case "2.4":
				ReaderList.deleteByRcode();
				break;	
			
			case "3":
				ReaderList.menuReader();
			case "3.1":
				LendingList.Add();
				break;
			case "3.2":
				LendingList.DisplayData();
				break;	
			case "4":
				repeat= false;
//				System.out.println(repeat);
				System.out.printf("%47s%n","************END**********");
				break;
			default:
				System.out.println("The option is not valid. Please enter again another one: ");
				break;
			}
		} while (repeat== false);		//? Tai sao k dung
		scan.close();
	}
}
/*
 * System.out.println("Which item would you like to manage?");
 * System.out.printf("%-20s%n","1=Book");
 * System.out.printf("%-20s%n","2=Reader");
 * System.out.printf("%-20s%n","3=Lending");
 * System.out.printf("%-20s%n","4=Exit");
 * System.out.println("Enter your choise (1,2, 3 or 4): ");
 */
/*
 * switch(choice) { case 1: BookList.menuBook(); break; case 2:
 * ReaderList.menuReader(); break; case 3: LendingList.menuLending(); break;
 * case 4: scan.close(); System.out.println();
 * System.out.printf("%47s%n","************END**********"); break; default:
 * System.out.println("Not Valid. Enter again: "); }
 */