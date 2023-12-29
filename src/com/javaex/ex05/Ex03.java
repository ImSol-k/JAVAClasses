package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		//선언, 생성
		double[] dArr = new double[3];
		//초기화
		dArr[0] = 3.5;
		dArr[1] = 7.2;
		dArr[2] = 12;	//자동형변환
		
		//선언, 생성, 초기화 한꺼번에 가능
		//한꺼번에 할때는 생성시 배열의 크기를 넣지 않는다
		int[] intArr = new int[] {1, 2, 3};
		//new도 생략 가능
		int[] iArr = {2, 3, 4};
		
		for(int i = 0; i < dArr.length; i++) {
			System.out.println("dArr" + "[" + i + "] = " + dArr[i]);
		}
		System.out.println("==================");
		for(int i = 0; i < dArr.length; i++) {
			System.out.println("intArr" + "[" + i + "] = " + intArr[i]);
		}
		System.out.println("==================");
		for(int i = 0; i < dArr.length; i++) {
			System.out.println("iArr" + "[" + i + "] = " + iArr[i]);
		}
	}

}
