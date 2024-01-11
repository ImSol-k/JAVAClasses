package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {

		//Wrapper
		Integer i = new Integer(3 + 3);
		System.out.println("i.toString = " + i.toString());
		
		//박싱
		int a = 3;
		Integer v01 = a;
		System.out.println("v01.toString() = " + v01.toString());

		//언박싱
		int v02 = i;
		System.out.println("v02 = " + v02);
				
		//parseInt
		//문자열을 정수로 변환
		int result = Integer.parseInt("12345");
		System.out.println("result = " + result);
		/* 이렇게하면 쓸데없는 메모리를 올려야함
		Integer r01 = 100;
		int result = r01.parseInt("123455");
		System.out.println(result + 3);
		*/
		
		//valueOf
		//정수를 문자열로 변환
		String result2 = String.valueOf(999);
		System.out.println(result2 + 2);
		/* 이렇게하면 쓸데없는 메모리를 올려야함
		String str = "안녕하세요";
		String result2 = str.valueOf(555);
		System.out.println(result2);
		*/
		
		
	}

}
