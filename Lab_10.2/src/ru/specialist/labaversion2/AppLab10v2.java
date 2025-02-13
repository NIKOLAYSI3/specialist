package ru.specialist.labaversion2;

public class AppLab10v2 {

	public static void main(String[] args) {
		// Лабораторная работа № 10.2

		Point2 p = new Point2();
//		p.draw2();
//		System.out.println(p.distance2());
		
		Point2 p2 = new Point2(5, 14);
//		p2.draw2();
//		System.out.println(p2.distance2());
		
		Point2 p3 = new Point2(21, 35);
//		p3.draw2();
//		System.out.println(p3.distance2());
		
		Point2[] points = new Point2[] {p, p2, p3, new Point2(2, 3)};
		for(var point : points) {
			point.draw2();
			System.out.println(point.distance2());
		}
		
		for(int i = 0; i < points.length-1; i++) {
			for(int j = i+1; j < points.length; j++)
				if(points[i].distance2() > points[j].distance2()) {
					Point2 k = points[j];
					points[j] = points[i];
					points[i] = k;
				}
		}
		
		System.out.println();
		
		for(var point : points) {
			point.draw2();
			System.out.println(point.distance2());
		}
		
		
	}

}
