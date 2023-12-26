package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//증감연산자(++, --)
		//++ 변수+1, -- 변수-1
		//앞에붙으면 계산먼저 뒤에붙으면 출력먼저
		int a = 7;
		
		//앞에붙는경우(계산먼저)
		System.out.println("==============================");
		System.out.println("a   = " + a);
		System.out.println("++a = " + ++a);	//8
		System.out.println("a   = " + a);	//8
		System.out.println("--a = " + --a);	//7
		System.out.println("a   = " + a);	//7
		System.out.println("==============================");
		

	}

}
