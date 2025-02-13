package ru.specialist.app;

public class Point {
	public int x;
	public int y;
	
	public Point() {
		this(12, 7);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("(Point (%d, %d))\n", this.x, this.y);
	}
	
	public double distance() {
		return Math.sqrt((this.x * this.x) + (this.y + this.y));
	}
	
}
