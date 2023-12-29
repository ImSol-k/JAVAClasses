package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		//data배열에서 3의배수 갯수와 배수의 합 출력
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int result = 0;
		int num = 0;
		
		for(int i = 0; i < data.length; i++) {
			if (data[i] % 3 ==0) {
				result = data[i] + result;
				num++;
			}
			
			
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + num);
		System.out.println("주어진 배열에서 3의 배수의 합 =>" + result);

	}

}
