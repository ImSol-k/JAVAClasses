package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
	
		Point p1 = new Point();
		p1.getX(5);
		p1.getY(5);
		
		Point p2 = new Point();
		p2.getX(10);
		p2.getY(23);
		
		p1.draw();
		p2.draw();
		
	}

}
