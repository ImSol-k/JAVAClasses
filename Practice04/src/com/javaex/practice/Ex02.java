package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		//double형 배열 작성후 1.2, 3.3, 6.7값 순서대로 저장후 for문 이용해서 반대순으로 출력
		
		double[] dArr = new double[3];
		dArr[0] = 1.2;
		dArr[1] = 3.3;
		dArr[2] = 6.7;
		
		
		for(int i = dArr.length - 1; i >= 0; i--) {
			System.out.println(dArr[i]);
		}
		
	}

}
