import java.util.Scanner;

public class AppFindException {

	
	public static int fact = 1;
	public static int factorial(int n) {
		if(n < 0)
			n = -n;
		for(int i = 1; i <= n; i++) {
			fact = Math.multiplyExact(fact, i);
		}
		return fact;
	}
	
	
	
	
	public static void main(String[] args) {
		//Лабораторная № 6.1
		
		try {
		System.out.println(factorial(12));
		System.out.println(factorial(32));
		} catch (ArithmeticException ex) {
			//ex.getMessage();
			System.out.println(ex.getMessage());
		}
		

	}

}
