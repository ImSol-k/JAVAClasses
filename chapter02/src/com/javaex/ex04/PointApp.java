package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		p1.draw();
		p2.draw();
		
		System.out.println("첫번째 이동 : " + (p1.getX() + p1.getY()));
		System.out.println("두번째 이동 : " + (p2.getX() + p2.getY()));
		
	}

}
