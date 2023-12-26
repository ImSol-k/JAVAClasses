package com.javaex.ex01;

public class Ex11 {

	public static void main(String[] args) {
		
		//증감연산자 
		//뒤에붙는경우(출력먼저)
		int a = 10;
		
		System.out.println("==============================");
		System.out.println("a   = " + a);
		System.out.println("a++ = " + a++);	//10
		System.out.println("a   = " + a);	//11
		System.out.println("a-- = " + a--);	//11
		System.out.println("a   = " + a);	//10
		System.out.println("==============================");
		
		int no = 10;
		//System.out.println(++no + 3);	//14
		System.out.println(no-- + 3);	//13
		System.out.println(++no + 7);	//17
		System.out.println(++no + 2);	//13
		System.out.println("==============================");
		
		no = 10;
		
		System.out.println(no);	//10
		System.out.println(++no * 2);//22 	
		no--;
		System.out.println(no);	//10
		
	}

}
