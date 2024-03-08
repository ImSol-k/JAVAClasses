package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		
		//아래의 출력결과를 예상하여 작성하세요
		int a = 13;
		
		System.out.println((a > 13) && (a >= 13));
		//예상 : a는 13보다 크고 a는 13보다 크거나 같다
		//예상값 : false, 결과값 : false
		
		System.out.println((a > 13) || (a >= 13));
		//예상 : a는 13보다 크거나 a는 13보다 크거나 같다
		//예상값 : true, 결과값 : true
		
		System.out.println((a / 3  == 4) && (a % 3 == 2));
		//예상 : a/3(4)는 4와 같고 a/3의 나머지(1)은 2와 같다
		//예상값 : false, 결과값 : false
		
		System.out.println((a / 3  == 4) || (a % 3 == 2));
		//예상 : a/3(4)는 4와 같거나 a%3의 나머지(1)은 2와 같다
		//예상값 : true, 결과값 : true
		
		System.out.println((a / 3  == 4) && (a % 3 == 2) || (a / 3  == 4));
		//예상 : a/3(4)는 4와 같고 a%3(1)은 2와 같거나 a/3(4)는 4와 같다
		//예상값 : false, 결과값 : true
		//&&먼저 계산 후 || 계산이기때문에 true
		//**(a % 3 == 2) || (a / 3  == 4)
		
	}

}
