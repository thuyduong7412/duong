package business;

import java.util.ArrayList;
import java.util.Collections;

import ui.Menu;


public class Sort {	
	//sap xep
		public static void sort(ArrayList<Employee> emp) {		//getSimpleName
			Collections.sort(emp);
			Menu.displayTitle();
			for (Employee e:emp) {
				String s =e.getClass().getSimpleName().toString();
				if(s.equalsIgnoreCase("teacher")) {
					e.display();
				}
			}
		}
}
/*
if (x instanceof Teacher){


}
*/