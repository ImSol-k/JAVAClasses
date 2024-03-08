package com.javaex.ex01;

public class Ex13 {

	public static void main(String[] args) {
		
		//논리연산자
		//&&(AND)(둘다 true면 true 나머지 flase)
		//||(OR)(둘중 하나만 true여도 true)
		//!(NOT)(반대값 출력)
		
		//&&(AND)(~이고)
		//false하나라도 있으면 false
		System.out.println(true && true);	//true
		System.out.println(true && false);	//false
		System.out.println(false && true);	//false
		System.out.println(false && false); //false
		System.out.println("======================");
		
		//||(OR)(~거나)
		//true하나라도 있으면 true
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false); //false
		System.out.println("======================");
		
		//(!)NOT(아니다)
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		System.out.println("======================");
		
		
		//응용
		int a = 5;
		int b = 7;
		
		//a가 b보다 크고 a가 b보다 작다
		System.out.println(a > b && a < b);		//false
		//a가 b보다 작지 않고 a와 b가 같지 않다
		System.out.println(!(a > b) && a != b); //true
		//a+a가 b보다 크거나 a와 b가 같다
		System.out.println(a + a > b || a == b);//true
		//a보다 b가 작고 a보다 b가 크거나 a보다 b가 작다
		System.out.println(a > b && a < b || a < b);//true
		//a보다 b가 크거나 a보다 b가 크고 a보다 b가 작다
		System.out.println(a > b && (a < b || a < b));//false
		System.out.println(a < b && (a < b || a < b));//true
		System.out.println(a < b || a > b || a > b);  //true
		System.out.println(!(a < b || a > b) || a > b);//false
		System.out.println(!(!(a < b || a > b) || a > b));//true		
		System.out.println("======================");
		
		/*		
		result = ((x * y) % z) - (a / b)
		m = (x + y) + (z / 3)
		result = (x % y) * z
		x = (y = (w = z))
		x = (y = ((3 / 5) * 2) % 6)
		y = ((a * x) * x) + (b * x) + c
		*/
		
		//비트연산자 
		//&(and)둘다 true면 true 나머지 flase
		//|(or)둘중 하나만 true여도 true
		//^(xor)값이 같으면 false 값이 다르면 true
		//~(not)반대값
		System.out.println(a > b ^ a != b);//true
		
		
		
		
		
		
	}

}
