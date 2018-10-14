package entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import business.Employee;

public class Text {
	static File file= new File("text.txt");
	static PrintWriter pw ;

	public static void write(ArrayList<Employee> emp) throws FileNotFoundException {
			pw = new PrintWriter(file);
			try {
				if (!file.exists()) {
					file.createNewFile();
				}
				pw.printf("| %-4s","ID");
				pw.printf("| %-20s","NAME");
				pw.printf("| %-15s","FAC/DEPT");		
				pw.printf("| %-15s","DEG/POS");
				pw.printf("| %-20s","T.HOURS/W.DAYS");
				pw.printf("| %-20s", "SAL RATIO");
				pw.printf("| %-15s", "ALLOWANCE");
				pw.printf("| %-15s","SALARY");
				pw.printf("| %n");
				
				for (Employee t:emp) {
					pw.printf("| %-4s",t.getId());
					pw.printf("| %-20s",t.getName());
					pw.printf("| %-15s",t.getFac());
					if (t.getDegree()==null) {
						pw.printf("| %-15s",t.getPosition());
					} else {
						pw.printf("| %-15s",t.getDegree());
					}
					pw.printf("| %-20s",t.getHour());
					pw.printf("| %-20s", t.getSalaryRatio());
					pw.printf("| %-15s", t.allowance());
					pw.printf("| %-15s",t.salary());
					pw.printf("| %n");
				}
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	

	

}
/*
 * public static void ghi(ArrayList<Employee> cb) {
		File file = new File("text.txt");		
		try(FileWriter fr = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fr);
				PrintWriter pr = new PrintWriter( bw)){
			pr.println("STT" + "\t" +"Ten" +"\t"+" HsLuong "+"\t" + "Phong/Khoa"+"\t" +"So tiet/So ngay"+"\t" +" Phu cap"+"\t"+"Luong");
			for (Employee x : cb) {	
				if(x.getSoNgay()==0) {
					pr.println( x.getId()+"\t" + x.getTen()+"\t"+ x.getHsLuong()+ "\t\t" + x.getDept()+"\t\t"+x.getSoTiet()+"\t\t" +x.getPhuCap()+ "\t\t" + x.luong());	
				}else {
				pr.println( x.getId()+"\t" + x.getTen()+"\t"+ x.getHsLuong()+ "\t\t" + x.getDept()+"\t\t"+x.getSoNgay()+"\t\t"+ x.getPhuCap()+ "\t\t" + x.luong());
				}
			}
		}catch(Exception e){
			
		}
 */

//public static void main(String[] args) throws IOException {
//ArrayList<Employee> emp= new ArrayList<Employee>();
//Employee d;
////(int id, String name, float salaryRatio,String fac, LstDeg degree, int hour)
//d= new Teacher(1,"DUONG",2,"TOAN",LstDeg.BACHELOR,5);
//emp.add(d);
//Teacher h= new Teacher(2,"HIEN",5,"LY",LstDeg.BACHELOR,5);
//emp.add(h);
//write(emp);
//
//
//}

//public static void writeTitle() {
//try {
//	if (!file.exists()) {
//		file.createNewFile();
//	}
//	PrintWriter pw = new PrintWriter(file);
//	pw.printf("| %-4s","ID");
//	pw.printf("| %-20s","NAME");
//	pw.printf("| %-15s","FAC/DEPT");		
//	pw.printf("| %-15s","DEG/POS");
//	pw.printf("| %-20s","T.HOURS/W.DAYS");
//	pw.printf("| %-20s", "SAL RATIO");
//	pw.printf("| %-15s", "ALLOWANCE");
//	pw.printf("| %-15s","SALARY");
//	pw.printf("| %n");
//	pw.close();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//}



//public static void writeList(ArrayList<Employee> emp) {
//FileWriter writer;
//try {
//	writer = new FileWriter("file.txt");
//	for (Employee e: emp) {
//		writer.write(e.getId());
//	}
//} catch (IOException e1) {
//	// TODO Auto-generated catch block
//	e1.printStackTrace();
//} 
//
////for(String str: arr) {
////	  writer.write(str);
////	}
//}

//public static void write(Staff emp) {
//	try {
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		pw.printf("| %-4s",emp.getId());
//		pw.printf("| %-20s",emp.getName());
//		pw.printf("| %-15s",emp.getDept());		
//		pw.printf("| %-15s",emp.getPosition());
//		pw.printf("| %-20s",emp.getDay());
//		pw.printf("| %-20s", emp.getSalaryRatio());
//		pw.printf("| %-15s", emp.allowance());
//		pw.printf("| %-15s",emp.salary());
//		pw.printf("| %n");
//		pw.close();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//public static void write(Teacher emp) throws FileNotFoundException {
//	pw = new PrintWriter(file);
//try {
//	if (!file.exists()) {
//		file.createNewFile();
//	}
//	//pw = new PrintWriter(file);
//	pw.printf("| %-4s",emp.getId());
//	pw.printf("| %-20s",emp.getName());
//	pw.printf("| %-15s",emp.getFac());		
//	pw.printf("| %-15s",emp.getDegree());
//	pw.printf("| %-20s",emp.getHour());
//	pw.printf("| %-20s", emp.getSalaryRatio());
//	pw.printf("| %-15s", emp.allowance());
//	pw.printf("| %-15s",emp.salary());
//	pw.printf("| %n");
//	pw.close();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//}
