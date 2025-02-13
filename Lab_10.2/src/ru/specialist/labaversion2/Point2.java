package ru.specialist.labaversion2;

public class Point2 {
	public int x;
	public int y;
	
	public Point2() {
		this(12, 4);
	}
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw2() {
		System.out.printf("(Point (%d, %d))\n", this.x, this.y);
	}
	
	public double distance2() {
		return Math.sqrt((this.x * this.x) + (this.y + this.y));
	}
}
