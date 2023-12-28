package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {

		// 1에서 20까지의 수에서 2의배수, 3의배수를 제외한 숫자 출력
		// for문, countinue사용

		int num = 20;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				continue;
			} 
			else if (i % 3 == 0) {
				continue;
			} 
			else {
				System.out.println(i);
			}
		}

	}

}
