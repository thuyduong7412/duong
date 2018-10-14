package business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import business.MyEnum.LstDeg;
import business.MyEnum.LstPos;

class TestSearchDept {
/*
 * Teacher(String fac, LstDeg degree, int hour)
 * Staff(String dept, LstPos position, int day)
 */
	@Test
	void test() {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		emp.add(new Teacher("TOAN",LstDeg.BACHELOR,2));
		emp.add(new Staff("KE TOAN",LstPos.HEAD,2));
		emp.add(new Teacher("toan",LstDeg.BACHELOR,10));
		ArrayList<Employee> result;
		result=Search.Sdept(emp, "TOAN");
		for (Employee e:result) {
			assertEquals("TOAN", e.getFac().toUpperCase());
	
		}
	}

}
