package com.javaex.ex01;

public class MyListApp {
	
	public static void main(String[] args) {
		
		String line = "=============================================";
		
		PointList pList = new PointList();
		Point p1 = new Point(2, 2);
		Point p2 = new Point(12, 13);
		Point p3 = new Point(22, 23);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		System.out.println(pList.toString());
		pList.showInfo();
		System.out.println(line);
		
		int count = pList.size();
		System.out.println("ListSize = " + count);
		Point p = pList.get(0);
		System.out.println("p.getX() = " + p.getX());
		System.out.println(line);
		
		
		
		CircleList cList = new CircleList(); 
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(3);
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		System.out.println(cList.toString());
		cList.showInfo();
		System.out.println(line);
		
	}	
	
}
