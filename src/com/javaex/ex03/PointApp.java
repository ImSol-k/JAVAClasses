package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		String line = "=======================";
		Point p1 = new Point(3, 5);
		Point p2 = new Point(3, 5);
		Point p3 = new Point(13, 15);
		Point p4 = p3;
				
		System.out.println("equals() 재정의");
		System.out.println(line);
		
		//equals
		System.out.println("p1.equals(p2) = " + p1.equals(p2));	//p1의 메소드사용
		System.out.println("p2.equals(p1) = " + p2.equals(p1));	//p2의 메소드사용
		System.out.println(line);
		
		System.out.println("p1.equals(p3) = " + p1.equals(p3));	
		System.out.println("p3.equals(p4) = " + p3.equals(p4));
		System.out.println(line);
		
		//주소비교
		System.out.println("p1 == p2 = " + (p1 == p2));
		System.out.println("p3 == p4 = " + (p3 == p4));
		
		
	}

}
