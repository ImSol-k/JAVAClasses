package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		MyList pList = new MyList();
		Point p1 = new Point(2, 4);
		Point p2 = new Point(5, 7);
		Point p3 = new Point(9, 9);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		System.out.println(pList.toString());
		
		
		MyList cList = new MyList();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(23);
		cList.add(c1);
		cList.add(c2);
		cList.add(p3);
		System.out.println(cList.toString());
		
		
		
	}

}
