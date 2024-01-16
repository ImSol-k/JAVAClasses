package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		//
		
		MyList<Point> pList = new MyList<Point>();
		Point p1 = new Point(2, 2);
		Point p2 = new Point(4, 4);
		Point p3 = new Point(5, 5);		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);		
		System.out.println(pList.toString());
		
		MyList<Circle> cList = new MyList<Circle>();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(3);
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		System.out.println(cList.toString());
		
		
		
	}

}
