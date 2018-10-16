package manage;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort{
	static Scanner scan;
	/*
	 * Selection Sort
	 */
	public static ArrayList<MyFile> selectionSort(ArrayList<MyFile> lstF){
		for(int i=0;i<lstF.size();i++) {
			int imin=i;
			for(int j=i ; j<lstF.size() ; j++) {
				if( lstF.get(j).getSize() < lstF.get(imin).getSize() ) {
					imin=j;
				}
			}
			MyFile tmp= lstF.get(i);
			lstF.set(i, lstF.get(imin));
			lstF.set(imin, tmp);
		}
		displaySort(lstF);
		return lstF;
	}
	/*
	 * Insertion Sort
	 */
	public static ArrayList<MyFile> insertionSort(ArrayList<MyFile> lstF){
		for(int i=1; i<lstF.size() ; i++) {
			MyFile f= lstF.get(i);
			int j=i;
			while( (j>0) && (lstF.get(j-1).getSize() > f.getSize()) ) {
				lstF.set(j, lstF.get(j-1));
				j--;
			}
			lstF.set(j,f);
		}
		displaySort(lstF);
		return lstF;
	}
	/*
	 * Hien thi Sort
	 */
	public static void displaySort(ArrayList<MyFile> listFile) {
		System.out.format("|%-20s", "NAME");
		System.out.format("|%-10s%n", "SIZE");
		for (MyFile x : listFile) {
			System.out.format("|%-20s", x.getName());
			System.out.format("|%-10s%n", x.getSize());
		}
	}
	/*
	 * Tong hop
	 */
	public static void SortSize(ArrayList<MyFile> lstF) {
		System.out.println("You have 2 options:");
		System.out.println("    1-Sort by selection sort algorithm");
		System.out.println("    2-Sort by insertion sort algorithm");
		scan = new Scanner(System.in);
		int n=0;
		do {
			n= Integer.parseInt(scan.nextLine());
			switch(n) {
			case 1:
				selectionSort(lstF);
				break;
			case 2:
				insertionSort(lstF);
				break;
			default:
				System.out.print("Please enter valid number: ");
			}
		}while (n!=1 && n!=2);		
		System.out.println("SORT DONE.");
		
	}
}
