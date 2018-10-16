package manage;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {	
	public static void menu() throws FileNotFoundException {		//D://FolderParent//Folder3//asm1.txt
		System.out.printf("%50s%n","------FILE MANAGER------");
		Scanner scan= new Scanner(System.in);
			int n=0;
			String s;
			do {
				System.out.println("You have 5 options: ");
				System.out.println("1- Enter a directory");
				System.out.println("2- Displays the directory tree structure & files list in that directory.");
				System.out.println("3- Display *.txt files in ascending order of size.");
				System.out.println("4- Enter a string and Look for *.txt files containing this string.");
				System.out.println("5- Exit.");
				System.out.println("Enter your choice: ");
				try {
					
					n= Integer.parseInt(scan.nextLine());
					switch(n) {
					case 1:
						DirectoryChild.input();
						break;
					case 2:
						DirectoryChild.child();
						break;
					case 3:										
						Sort.SortSize(DirectoryChild.listFile);
						break;
					case 4:
						System.out.print("Enter a string: ");
						s=scan.nextLine();
						SearchFile.lookFor(s,DirectoryChild.listFile);
						break;
					case 5:
						System.out.printf("%49s%n","-------THE END-------");
						break;
					default:
						System.out.println("Please enter valid number. ");
						break;
					}
				}	catch(NumberFormatException e) {
					System.out.println("Please enter valid number.");
				}	catch(Exception e){
					System.out.println("Gap loi roi "+e);
					break;
				}
				
			} while(n != 5);
		
		scan.close();
	}
}
//public static void main(String[] args) {
//try {
//	menu();
//} catch (FileNotFoundException e) {
//	System.out.println("Error:  "+e);
//}
//}