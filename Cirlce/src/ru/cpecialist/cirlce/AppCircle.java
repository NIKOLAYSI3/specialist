package ru.cpecialist.cirlce;

public class AppCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 10;
		double circleLength = 2 * Math.PI * radius, circleArea = Math.PI * Math.pow(radius, 2);
		System.out.printf("Длинна окружности - %.2f\nПлощадь круга - %.2f", circleLength, circleArea);
	}

}
