package business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import business.MyEnum.LstDeg;
import business.MyEnum.LstPos;

class TestSalary {

	/*
	*Staff(LstPos position,float salaryRatio, int day)
	*this.getSalaryRatio()*730+ this.allowance()+this.getDay()*30
	*this.getSalaryRatio()*730+ this.allowance()+this.getHour()*45
	*/
	@Test
	void testStaff() {
		Staff st = new Staff(LstPos.HEAD,1,1);
		assertEquals(2760, st.salary());
	}
	
	@Test
	void testTeacher() {
		Teacher te = new Teacher(LstDeg.BACHELOR,1,2);
		assertEquals(1120,te.salary());
	}

}
