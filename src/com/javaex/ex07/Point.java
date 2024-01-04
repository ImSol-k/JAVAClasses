package com.javaex.ex07;

public class Point {

	private int y;
	private int x;

	public Point() {
		System.out.println("Point()");
	}
	public Point(int x) {
		this.x = x;
		System.out.println("Point(x)");
	}
	public Point(int x, int y) {
		this(x);
		this.y = y;
		System.out.println("Point(x, y)");
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다");
		System.out.println("=========================");
	}

	@Override
	public String toString() {
		
		return "Point [y=" + y + ", x=" + x + "]";
	}
	
	

}
