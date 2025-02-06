package ru.specialist.ascii;

public class App {

	public static void main(String[] args) {
		// Лабораторная работа № 4.2
		System.out.print("   "); // отступ для 1 строки
		for(int i = 0; i <= 15; i++) {
			System.out.printf("%3X", i); // первая строка
		}
		
		System.out.println();
		
		for(int i = 0; i <= 15; i++) {
			System.out.printf("%3X", i); // первый столбец
			
			
			for(int j = 0; j <= 15; j++) {	
				char ch = (char)((j << 4) + i); // сдвиг колонки на 4 бита, чтобы отобразился значение по таблице ASCII
				if(ch < 33 || j == 0x8 || j == 0x9) {  // условие чтобы не попадались неотображаемые знаки
					ch = ' ';
				}
				System.out.printf("%3c", ch);  // вывод n строки
			}
			
			System.out.println();  
		}
		
	}

}
