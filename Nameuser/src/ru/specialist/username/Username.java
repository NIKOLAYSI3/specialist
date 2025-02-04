package ru.specialist.username;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите имя пользователя: ");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.printf(name.isEmpty() ? "Привет, незнакомец!" : "Привет, %s",name);
	}

}
