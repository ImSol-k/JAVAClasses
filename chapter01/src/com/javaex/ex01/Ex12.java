package com.javaex.ex01;

public class Ex12 {

	public static void main(String[] args) {
		
		//관계연산자
		//결과값을 true, false로 반환한다		
		int n1 = 5;
		int n2 = 3;
		boolean result = n1 < n2;
		
		System.out.println("==============================");
		System.out.println(result);
		System.out.println(n1 < n2);	//n1이 n2보다 작다(false)
		System.out.println(n1 > n2);	//n1이 n2보다 크다 (true)
		System.out.println(n1 <= n2);	//n1이 n2보다 작거나 같다(false)
		System.out.println(n1 >= n2);	//n1이 n2보다 크거나 같다(true)
		System.out.println(n1 == n2);	//n1과 n2같다(false)
		System.out.println(n1 != n2); 	//n1과 n2가 다르다 (true)
		System.out.println("==============================");
		System.out.println(n1 + n2 == n2);	//false
		System.out.println(n1 > n2 + n2);	//false
		System.out.println(n1 * n2 <= 15); 	//true
		System.out.println(n1 * n2 != n1);	//true
		
	}

}
