package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		// 배열을 사용해서 1~45까지의 숫자중 랜덤숫자 6개 출력
		// 중복체크하기

		//배열선언
		int[] num = new int[6];

		//랜덤한 숫자 생성
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 7) + 1;

			//중복체크
			for (int j = 0; j < i; j++) {
				//num[i]와 num[j]가 같으면
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
