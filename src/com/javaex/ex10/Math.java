package com.javaex.ex10;

public class Math {
	
	//필드
	
	
	//생성자
	
	
	//메소드gs
	
	
	//메소드
	public int plus(int a, int b){
		int sum = a + b;
		return sum;
	}
	public double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}
	public String plus(String a, int b) {
		String sum = a;
		for(int i = 1; i < b; i++) {
			sum = sum + a;
		}
		
		return sum;
	}
	
}
