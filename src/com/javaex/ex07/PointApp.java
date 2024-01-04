package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {
		
		Point po1 = new Point(-3, -2);
		Point po2 = new Point(100, 100);
		
		System.out.println(po1.line);
		po1.draw();
		po2.draw(true);
		po1.draw(false);
		
	}

}
