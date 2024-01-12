package com.javaex.ex01;

public class MyListApp {
	
	public static void main(String[] args) {
		
		PointList pList = new PointList();
		Point p1 = new Point(2, 2);
		Point p2 = new Point(12, 13);
		Point p3 = new Point(22, 23);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		int count = pList.size();
		System.out.println("ListSize = " + count);
		
		Point p = pList.get(0);
		System.out.println("p.getX() = " + p.getX());
		System.out.println(pList.toString());
		pList.pArrPrint();
		
		
		Circle c1 = new Circle(5);
		
		
		
	}	
	
}
