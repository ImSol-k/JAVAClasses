package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		Point po1 = new Point(2, 3);
		Point po2 = new Point(7, 5);
		Point po3 = new Point(3, 6);
		pSet.add(po1);
		pSet.add(po2);
		pSet.add(po3);
		
		System.out.println(pSet.toString());
		System.out.println("==================================");
		
		Point po4 = new Point(7, 5);
		pSet.add(po4);
		for(Point p : pSet) {
			System.out.println(p + " hashCode = " +p.hashCode());
		}
		System.out.println("==================================");
		System.out.println("po2 = " + po2 + " hashCode = " +po2.hashCode());
		System.out.println("po4 = " + po4 + " hashCode = " +po4.hashCode());
		System.out.println(po2.equals(po4));
		
		
	}

}
