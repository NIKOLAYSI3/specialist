package ru.specialist.crows;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Лабораторная работа 3.2
		System.out.println("Введите число ворон на ветке: ");
		
		Scanner scan = new Scanner(System.in);
		int crow = scan.nextInt();
		
		String crowNumber;
		
		int overCrow = crow % 100;
		if(overCrow >= 11 && overCrow <= 14)
			crowNumber = "ворон";
		else {
			crowNumber = switch(crow % 10) {
			case 1 			-> "ворона";
			case 2, 3, 4 	-> "вороны";
			default 		-> "ворон";
			 				
		};

	};
		System.out.printf("На ветке %d %s",crow, crowNumber);
		
	}

}
 