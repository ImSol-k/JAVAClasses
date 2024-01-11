package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//Object 구조
		Object obj = new Object();
		
		//class의 주소 경로..?
		System.out.println(obj.getClass());		
		
		//기본으로 정의되어있는 toString
		System.out.println(obj.toString());
		
		//hashCode는 주소를 나타냄
		//실제 주소가 아님 번역된 주소를 알려준다
		System.out.println(obj.hashCode());
		
		//obj의 안에들어있는 값과 (obj)안에 들어있는 값을 비교
		System.out.println(obj.equals(obj));
		
		System.out.println("========================");
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj);
		
		
	}

}
