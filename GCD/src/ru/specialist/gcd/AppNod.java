package ru.specialist.gcd;

public class AppNod {

	public static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}		 
		}
		return a + b;
	}

	public static void main(String[] args) {
		// Лабораторная работа № 5.2

		System.out.printf("НОД чисел 14 и 35 = %d\n", nod(14, 35));
		System.out.printf("НОД чисел 35 и 14 = %d\n", nod(35, 14));
		System.out.printf("НОД чисел 1071 и 462 = %d\n", nod(1024, 216));

	}

}
