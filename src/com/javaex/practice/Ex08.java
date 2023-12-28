package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int dan = 2;
		int num = 1;
		int result;
		
		for(int i = 1; i < 9; i++) {
			//System.out.print(i);
			result = dan * i;
			//System.out.print(num + " * " + i + " = " + result + "\t");
			for(int j = 1; j <= 9; j++) {				
				System.out.print(dan + " * " + num + " = " + result + "\t");
			}
			num++;
			System.out.println();
		}
		
		
		
	}

}
