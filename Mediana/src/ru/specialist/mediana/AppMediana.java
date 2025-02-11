package ru.specialist.mediana;

import java.util.Arrays;
import java.util.Scanner;

public class AppMediana {
	
	public static int[] inputArray() {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Введите размер массива: ");
			int size = scan.nextInt();
			int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("Введите аргумент массива [%d]: ", i);
			arr[i] = scan.nextInt();
		}
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
	
	
	
	
	public static double mediana(int...arr) {
		Arrays.sort(arr);
		if (arr.length % 2 == 0) {
			return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2D;
		} else
			return arr[arr.length / 2];

	}
	

	public static void printArr(double mediana) {
		System.out.printf("Mediana: %f\n", mediana);
	}
	
	public static void main(String[] args) {
		
		int[] initArr = inputArray();
		int[] anArr = analyzerArray(initArr);
		System.out.println();
		print(anArr);
		System.out.println();
		double mediana = mediana(initArr);
		printArr(mediana);
	}
//12, 3, 56, 67, 13, 1000, 25, 75, 34
}
