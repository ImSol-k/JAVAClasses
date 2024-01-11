package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = "안녕하세요";
		String s02 = s01;
		String s03 = "안녕하세요";
		
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println("s03 = " + s03 +"\thashCode() = " +  s03.hashCode());
		System.out.println("======================================");
		
		s01 = "안녕";
		s02 = "하세요";
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println("s03 = " + s03 +"\thashCode() = " +  s03.hashCode());
		System.out.println("======================================");
		
		s03 = "ㅎㅎ";
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println("s03 = " + s03 +"\thashCode() = " +  s03.hashCode());
		System.out.println("======================================");
		
		s01 = "안녕하세요";
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println("s03 = " + s03 +"\thashCode() = " +  s03.hashCode());
		System.out.println("======================================");
		
	}

}
