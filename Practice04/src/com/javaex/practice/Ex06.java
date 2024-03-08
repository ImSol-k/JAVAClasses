package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		//주어진 문자열의 공백을 ','로 바꾸어 출력 
		
		char[] c = {'T','h', 'i', 's', ' ', 'i', 's', ' ', 'a', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		//바꾸기전 공백으로 출력
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);;
		}
		System.out.println();
		
		//바꾼후 ,로 출력
		for(int i = 0; i < c.length; i++) {
			if(c[i] == ' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}
		
		
	}

}
