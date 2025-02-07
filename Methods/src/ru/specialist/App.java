package ru.specialist;

public class App {
	
	public static final String DEFAULT_USER_NAME = "Незнакомец"; 	// constant
	public static final int DEFAULT_AGE = 18;						// constant

	public static void sayHello(String userName, int age) {
		System.out.printf("Привет, %s - %d!\n", userName, age);
	}
	// перегурзка @Override
	public static void sayHello(String userName) {
		//System.out.printf("Привет, %s!\n", userName);
		sayHello(userName, DEFAULT_AGE);
	}
	// перегурзка @Override
	public static void sayHello() {
		sayHello(DEFAULT_USER_NAME);
	}
	
	public static double average(int a, int b) {
		double avg = (a + b) / 2D;
		return avg;
	}
	
	// перегурзка @Override
	public static double average(int a, int b, int c) { 
		double avg = (a + b + c) / 2D;
		return avg;
	}
	
	// перегурзка @Override
	public static double average(double a, double b) {
		double avg = (a + b) / 2D;
		return avg;
	}
	
	/*
		n! = 1 * 2 * 3 .... * n
		0! = 1
		n! = (n-1)! * n
	
	*/
	public static int factorial(int n) {
		if(n == 0) return 1;
		return factorial(n - 1) * n;
	}
	
	public static void main(String[] args) {
		
		//App app = new App();
		
		//app.sayHello();
		//app.sayHello();
		
		/*
		 * App.sayHello("Sergey", 19); sayHello("Andrey", 26); sayHello("Pasha");
		 * sayHello();
		 * 
		 * double x = average(10, 11) * 3; System.out.println(x);
		 * System.out.println(average(11, 12)); System.out.println(average(11, 12, 13));
		 * System.out.println(average(11.5, 12.8));
		 */
		
		System.out.println(factorial(4));
		
		
		
	}

}
