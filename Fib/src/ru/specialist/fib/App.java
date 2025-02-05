package ru.specialist.fib;

public class App {

	public static void main(String[] args) {
		// Лаборатораня работа № 4.1
		int x = 0;
		int z = 1;		
		int fib = 0;
		while(fib <= 1000) {
			System.out.println(fib);
			if(fib == 1) {
				System.out.println(fib);
			}
			fib = x + z;
			x = z;
			z = fib;
		}
		
	}

}
