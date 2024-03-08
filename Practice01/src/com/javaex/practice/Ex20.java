package com.javaex.practice;

public class Ex20 {

	public static void main(String[] args) {
		
		//아래의 출력결과를 예상하여 작성해보세요
		
		int i = 10;
		int n = i++ % 2;
		
		System.out.println(i);
		//예상 : 10 ++
		//예상값 : 10, 결과값 : 11
		
		System.out.println(n);
		//예상 : 11 % 2
		//예상값 : 1, 결과값 : 0
		
		//n이 나중에출력되서 먼저출력된 i값은 10
		//ㅠㅠㅠ햇갈...

	}

}
