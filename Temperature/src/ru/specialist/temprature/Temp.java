package ru.specialist.temprature;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Вывести в градусы фарингейта по формуле x * 9 / 5 + 32
		// Вывести резльтут на экран с 2-мя знаками после запятой
		
		System.out.println("Введите температуру в градусах цельсия: ");
		
		Scanner scanTemp = new Scanner(System.in);
		
		double celsiaTemp = scanTemp.nextDouble();
		double faringateTemp = celsiaTemp * 9 / 5 + 32;
		
		System.out.printf("Градусов цельсия: %.2f\nГрадусов фарингейта: %.2f\n", celsiaTemp, faringateTemp);
		
	}

}
