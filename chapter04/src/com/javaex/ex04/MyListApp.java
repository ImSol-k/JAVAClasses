package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		
		//PointList
		ArrayList<Point> pList = new ArrayList<Point>();
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p1);
		pList.add(p1);
		//get까지의경로 저장가능(반복문 사용안됌)
		Point var1 = pList.get(0);	
		System.out.println("==pList===============");
		System.out.println("pList.size() = " + pList.size());
		System.out.println("p1.Y = " + var1.getY() +", p1.X = " + var1.getY());
		//반복문으로 List 출력하기
		for (int i = 0; i < pList.size(); i++) {
			System.out.println("pList[" + i + "].getX = " + pList.get(i).getX() + " / pList[" + i + "].getY = " + pList.get(i).getY());
		}
		System.out.println("======================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println("[" + i + "]" + pList.get(i).toString());
		}
		System.out.println("======================");
		pList.remove(0);	//index를 지우면 해당인덱스 데이터 삭제
		pList.remove(p1);	//obj를 지우면 가장 먼저선언된 해당 객체 삭제
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("======================");
		
		//CircleList
		List<Circle> cList = new ArrayList<Circle>();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(3);
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		System.out.println("==cList===============");
		System.out.println(cList.get(1));
		for (int i = 0; i < cList.size(); i++) {
			System.out.println("cList[" + i + "].getRadius = " + cList.get(i).getRadius());
		}
		System.out.println("======================");
		
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		System.out.println("======================");
		
		
		//IntegerList
		//기본자료형의 참조형은 박싱언박싱기능이 있기때문에 new로 선언을 하지 않아도 주소값이 들어감
		//기본자료형처럼 사용 가능
		List<Integer> iList = new ArrayList<Integer>();
		Integer i1= 1;
		Integer i2= 3;
		Integer i3= 6;
		iList.add(i1);
		iList.add(i2);
		iList.add(i3);
		System.out.println("==iList===============");
		for (int i = 0; i < iList.size(); i++) {
			System.out.println("iList[" + i + "] = " + iList.get(i).toString());
		}
		
	}

}
