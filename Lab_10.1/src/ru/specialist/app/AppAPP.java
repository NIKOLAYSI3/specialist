package ru.specialist.app;

public class AppAPP {

	public static void main(String[] args) {
		// Лабораторная работа № 10.1
		
		Point p = new Point();
		p.draw();
		System.out.println(p.distance());
		
		Point p2 = new Point(6, 16);
		p2.draw();
		System.out.println(p2.distance());
		
		Point p3 = new Point(19, 23);
		p3.draw();
		System.out.println(p3.distance());
		
	}

}
