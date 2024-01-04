package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {
		
		Point po1 = new Point();
		po1.setX(33);
		po1.setY(8);
		
		Point po2 = new Point(8);
		po2.setY(43);
		
		Point po3 = new Point(20, 30);
		
		po1.draw();
		po2.draw();
		po3.draw();
		
		po2.setX(34);
		po2.draw();
	}

}
