package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] iArr = new int[6];
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random() * 45) + 1;
			
			System.out.print(iArr[i] + " ");
		}
		
		
	}

}
