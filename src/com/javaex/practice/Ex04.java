package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		//data배열에서 3의배수 갯수와 배수의 합 출력
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int result = 0;
		int num = 0;
		
		for(int i = 0; i < data.length; i++) {
			
			//3의 배수이면
			if (data[i] % 3 ==0) {
				
				//3의배수인수더하기
				result = data[i] + result;
				
				//3의 배수인 수가 나올때마다 갯수 저장
				num++;
			}
			
			
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + num);
		System.out.println("주어진 배열에서 3의 배수의 합 =>" + result);

	}

}
