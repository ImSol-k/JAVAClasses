package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dan;
		
		System.out.print("단 : ");
		dan = in.nextInt();
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		in.close();
	}

}
