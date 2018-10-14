package ui;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Menu.menu();
	}
	
}



//try {
//	File file= new File("file.txt");
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