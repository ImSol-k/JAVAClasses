package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int num = 1;
		int result;
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 2; j <= 9; j++) {
				result = j * i;
				System.out.print(j + " * " + num + " = " + result + "\t");
			}
			num++;
			System.out.println();
		}
		
		
		
	}

}
