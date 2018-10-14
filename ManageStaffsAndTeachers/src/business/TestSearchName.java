package business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestSearchName {
	@Test
	public void test() {
		ArrayList<Employee> emp= new ArrayList<Employee>();
		emp.add(new Teacher("DUONG"));
		emp.add(new Staff("duong"));
		emp.add(new Teacher("HOA"));
		ArrayList<Employee> rel;
		rel=Search.Sname(emp,"DUONG");
//		rel.add(new Staff("HA"));
		for (Employee e:rel) {
			assertEquals("DUONG", e.getName().toUpperCase());
		}
	}

}
