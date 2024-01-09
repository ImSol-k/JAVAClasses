package com.javaex.ex16;

public class Point {
	
	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Point() {
		System.out.println("Point()");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(x, y)");
	}
	
	//GetterSetter메소드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//toString
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]을 그렸습니다.";
	}
	
	
}
