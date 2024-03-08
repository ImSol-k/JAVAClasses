package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {
		
		Point po = new Point(4, 4);
		ColorPoint cp1 = new ColorPoint("red");
		cp1.setX(2);
		cp1.setY(5);
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		System.out.println("====================================");
		System.out.println(po.toString());
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
		System.out.println("====================================");
		
		//예상
		//Point(x, y)
		//Point()
		//ColorPoint(color)
		//Point(x, y)
		//ColorPoint(x, y, color)
		
	}

}
