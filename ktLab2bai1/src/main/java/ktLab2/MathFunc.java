package ktLab2;

import java.util.Iterator;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MathFunc {
	int calls;
	
	public int getCalls() {
		return this.calls;
	}
	
	public long factorial(int number) {
		this.calls++;
		if(number < 0) {
			throw new IllegalArgumentException();
		}
		long result = 1;
		
		if(number > 1) {
			for(int i = 1; i <= number; i++) {
				result *= i;
			}
		}
		
		return result;
	}
	
	public long plus(int number1, int number2) {
		this.calls++;
		return (number1 + number2);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
