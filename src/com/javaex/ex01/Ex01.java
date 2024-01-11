package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//Object 구조
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		String line = "============================";
		
		//class의 주소 경로..?
		System.out.println("getClass()");
		System.out.println(line);
		System.out.println(obj1.getClass());		
		System.out.println(obj2.getClass());
		System.out.println(line);
		
		//기본으로 정의되어있는 toString
		System.out.println("toString()");
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(line);
		
		//hashCode는 주소를 나타냄
		//실제 주소가 아님 번역된 주소를 알려준다
		System.out.println("hashCode()");
		System.out.println("obj1.hashCode() = " + obj1.hashCode());
		System.out.println(line);
		
		//obj의 안에들어있는 값과 (obj)안에 들어있는 값을 비교
		System.out.println("obj1.equals(obj1) = " + obj1.equals(obj1));
		System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
		System.out.println(line);
		
		//주소값 비교
		System.out.println("obj1 == obj1 = " + (obj1 == obj1));
		System.out.println("obj1 == obj2 = " + (obj1 == obj2));
		System.out.println(line);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
	}

}
