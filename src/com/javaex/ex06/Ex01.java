package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		String line = "======================================";
		String s1 = new String("안녕하세요");
		String s2 = new String("안녕하세요");
		
		String s01 = "안녕하세요";
		String s02 = s01;
		
		//문자열로 바로선언
		System.out.println(line);
		System.out.println("String에 문자열을 바로 넣을경우(new)생략");
		System.out.println(line);
		System.out.println("s01의 주소와 s02의 주소가 같다 : " + (s01 == s02));
		System.out.println(line);
		
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println(line);
		
		s01 = "안녕";
		s02 = "하세요";
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println(line);
		
		s01 = "안녕하세요";
		System.out.println("s01 = " + s01 +"\thashCode() = " +  s01.hashCode());
		System.out.println("s02 = " + s02 +"\thashCode() = " +  s02.hashCode());
		System.out.println(line);
		
		//new로 선언
		System.out.println(line);
		System.out.println("new String()으로 문자열을 저장할 경우");
		System.out.println("s1과 s2의 주소가 같다 : " + (s1 == s2));
		System.out.println(line);
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println(line);
		
	}

}
