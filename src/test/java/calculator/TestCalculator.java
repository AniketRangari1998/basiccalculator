package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void test() {
		CalculatorClass c = new CalculatorClass();
		
		int actual1 = c.add(10,20);
		int expected1=30;
		assertEquals(expected1,actual1);
		
		double actual2 = c.multi(5,6);
		double expected2=30;
		assertEquals(expected2,actual2);
		
		double actual3  = c.divide(20,10);
		double expected3 =2;
		assertEquals(expected3,actual3);
		
		int actual4 = c.sub(10,20);
		int expected4=-10;
		assertEquals(expected4,actual4);
		
	}

	

}
