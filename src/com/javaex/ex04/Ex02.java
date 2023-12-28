package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dan;
		int i = 1;
		
		System.out.print("단 : ");
		dan = in.nextInt();
		
		while(i <= 9) {
			
			System.out.println(dan + " * " + i + " = " + (dan * i));
			
			i++;
		}
		
		in.close();
		
	}

}
