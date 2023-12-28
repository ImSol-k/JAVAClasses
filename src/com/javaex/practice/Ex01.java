package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int index = 0;
		
		System.out.println("while문");
		while(index < 3) {
			System.out.println("index = " + index);
			index++;
		}
		//예상
		//index = 0
		//index = 1
		//index = 2
		
		System.out.println("for문");
		for(int order = 0; order < 3; order++) {
			System.out.println("order = " + order);
		}
		//예상
		//order = 0
		//order = 1
		//order = 2
	}

}
