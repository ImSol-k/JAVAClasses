package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		//배열을 사용해서 1~45까지의 숫자중 랜덤숫자 6개 출력
		//중복체크하기
		
		int[] num = new int[6];
		
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 7) + 1;
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					
				}
			}
		}
		for(int i = 0; i > num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
