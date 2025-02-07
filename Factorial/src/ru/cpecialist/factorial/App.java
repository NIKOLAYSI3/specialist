package ru.cpecialist.factorial;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Введите число для вычисления факториала: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int fact = 1;
		
		// меняет - на +
		if(n < 0)
			n = -n;
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.print(fact);

	}

}
