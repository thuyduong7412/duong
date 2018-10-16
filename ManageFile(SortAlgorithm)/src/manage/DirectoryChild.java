package manage;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DirectoryChild {
	static Scanner scan;
	public static ArrayList<MyFile> listFile=new ArrayList<MyFile>();
	static File curFol;
	/*
	 * in khoang trang
	 */
	public static String space(int n) {
		String space="";
		for (int i=0;i<n;i++) {
			space += "     ";
		}
		return space;
	}
	/*
	 * in cay thu muc
	 */
	public static void displayChild(int level,File curFol) {
		System.out.println(space(level)+curFol.getName());
		if (curFol.isDirectory()) {
			String[] listChild= curFol.list();
			File child;
			level++;
			for (String x: listChild) {
				child =new File(curFol,x);
				displayChild(level,child);
			}
		}
		if(curFol.isFile() && curFol.getName().endsWith(".txt")){
				MyFile f= new MyFile(curFol.getName(), curFol.length(), curFol.getAbsolutePath());
				listFile.add(f);
		}
	}
	
	/*
	 * Nhap vao mot chuoi
	 */
	public static void input() {
		scan= new Scanner(System.in);
		System.out.print("Enter a true dicrectory: ");
		curFol =new File(scan.nextLine());
		while(!curFol.exists()) {
			System.out.print("This folder does not exit. Re-enter a true dicrectory: ");
			String s= scan.nextLine();
			curFol = new File(s);
		} 
		
	}
	/*
	 * tong hop 
	 */
	public static void child() {
			System.out.println("TREE FOLDER: ");
			displayChild(0,curFol);
//			listFile= findListFile(curFol);
			if (listFile.size()==0) {
				System.out.println("THERE ARE NO *.txt IN THIS DIRECTORY.");
			} else {
				System.out.println( "THE FILE *.txt IN THIS DIRECTORY ARE: ");
				for(MyFile tmp:listFile) {
					System.out.print("   "+tmp.getName() + ",");
				}
				System.out.println();
			}
		
	}
}

/*
 * tim danh sach file *.txt trong thu muc
 */
//			public static ArrayList<MyFile> findListFile(File curFol){
//				if (curFol.isFile() && curFol.getName().endsWith(".txt")) {
//					MyFile f= new MyFile();
//					f.setName(curFol.getName());
//					f.setSize(curFol.length());
//					f.setFullPath(curFol.getAbsolutePath());
//					listFile.add(f);
//				}
//				if (curFol.isDirectory()) {
//						String[] sub=curFol.list();
//						for(String e:sub) {
//							findListFile(new File(curFol,e));
//						}
//				}
//				return listFile;
//			}

//public static void main(String[] args) {
//	child();
//	File file= new File("D://FolderParent//Folder3//asm1.txt");
//	displayChild(0,file);
	//listFile=findFile(file);
	
//	for(MyFile f:listFile) {
//		f.display();
//	} 
//	for(MyFile f:listFile) {
//		System.out.println(f.getSize());
//	}
//	System.out.println();
//	System.out.println();
//	Sort.insertionSort(listFile);
//	try {
//		ArrayList<MyFile> result=new ArrayList<MyFile>();
//		result= findFile.find("POIUG", listFile);
//		
//		if(result.size()==0) {
//			System.out.println("NOT FOUND");
//		} else {
//			System.out.println(result.size());
//			for (MyFile tmp:result) {
//				System.out.println(tmp.getName());
//			}
//		}
//		
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//}









