package com.javaex.ex12;

public class Math {
	
	//필드
	
	
	//생성자
	
	
	//메소드gs
	
	
	//메소드
	public static int plus(int a, int b){
		return a + b;
	}
	public double plus(double a, double b) {
		return a + b;
	}
	public String plus(String a, int b) {
		String sum = a;
		for(int i = 1; i < b; i++) {
			sum = sum + a;
		}
		
		return sum;
	}
	
}
