package ru.specialist.lab11;

public class AppLab11 {

	public static void main(String[] args) {
		// Лабораторная работа № 11
		
		InitList list = new InitList();
		list.add(12).add(6).add(24).add(62).add(17);
		list.print(); 
		list.remove(17);
		list.print(); 
		list.contais(62);
		list.print(); 
		list.indexOf(24);
		list.print(); 
		list.get(3);
		list.print();

	}

}
