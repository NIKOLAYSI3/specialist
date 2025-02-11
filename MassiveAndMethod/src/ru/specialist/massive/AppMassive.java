package ru.specialist.massive;

import java.util.Scanner;

public class AppMassive {
	
	public static int[] inputArray() {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Введите размер массива: ");
			int size = scan.nextInt();
			int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("Введите аргумент массива [%d]: ", i);
			arr[i] = scan.nextInt();
		}
//		System.out.println();
//		for(int x : arr)
//			System.out.print(x + " ");
		return arr;
		}
	}
	
	public static int[] analyzerArray(int... arr) {
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		
		int[] mass = {min, max, sum};
		
		return mass;
	}
	
	public static void print(int... mass) {
		System.out.print("Расчёт Min, Max и Sum: ");
		for(int j = 0; j < mass.length; j++)
			System.out.print(mass[j] + " ");
	}

	public static void main(String[] args) {
		// Лабораторная работа № 7.1
			
		int[] initArr = inputArray();
		int[] anArr = analyzerArray(initArr);
		System.out.println();
		print(anArr);
		
	}

}