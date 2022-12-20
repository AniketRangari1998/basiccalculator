package calculator;

public class CalculatorClass {
	public int add(int a ,int b) {
		return a+b;	
	}
	
	public double multi(double a, double b) {
		 return  a*b;
	}
	
	public double divide(double a, double b) {
		if(b==0) {
			return -1;
		}
		return a/b;
	}
	public int sub(int a , int b) {
		return a-b;
	}
}
