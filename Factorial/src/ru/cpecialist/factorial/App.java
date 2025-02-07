package ru.cpecialist.factorial;

import java.util.Scanner;

public class App {
	
	public static int fact = 1;
	public static int factorial(int n) {
		if(n < 0)
			n = -n;
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		System.out.println("Введите число для вычисления факториала: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
			
		System.out.print(factorial(x));

	}

}
