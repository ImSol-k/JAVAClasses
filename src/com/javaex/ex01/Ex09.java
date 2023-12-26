package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		System.out.println("a = " + a + ", b = " + b);
					
		//산술연산자
		//대입하면 메모리에 저장되고
		int plus = a + b;
		System.out.println("plus = " + plus);
				
		//바로 출력하면 메모리없이 값이 바로 출력됨
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));		
		System.out.println("----------------------------");
		
		//나누기는 몫을 반환
		System.out.println(7 / 2);
		System.out.println((double)7 /2);
		System.out.println(7.0 / 2);
		//%연산자는 나머지를 반환
		System.out.println(7 % 2);
		System.out.println((double)7 % 2);
		System.out.println(7.0 % 2);
		System.out.println("----------------------------");
		
		//부호연산자
		//+그대로 -반대로
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(var);	//예상값 -3
		System.out.println(pVar);	//예상값 -3
		System.out.println(mVar);	//예상값 3
		
		int pl = -3 + 2;
		int pPl = +pl;
		int mPl = -pl;
		System.out.println(pl);
		System.out.println(pPl);
		System.out.println(mPl);

	}

}
