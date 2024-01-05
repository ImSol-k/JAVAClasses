package com.javaex.ex12;

import java.util.Scanner;

public class Math {
	
	private Scanner in = new Scanner(System.in);
	private static double pi = 3.14;
	
	public static int plus(int a, int b){
		return a + b;
	}
	public static double plus(double a, double b) {
		return a + b;
	}
	public static String plus(String a, int b) {
		String sum = a;
		for(int i = 1; i < b; i++) {
			sum = sum + a;
		}
		
		return sum;
	}
	
	public static double circleArea(int radius) {
		return pi * radius * radius;
	}
	
	
}
