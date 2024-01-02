package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		int[] arrB;
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//arrB에 arrA를 대입
		arrB = arrA;
		
		//arrA가 바뀌면 arrB도 바뀌는지 확인
		arrA[0] = 99;
		
		//arrA와 arrB의 주소가 같은지 확인
		System.out.println("arrA주소값 : " + arrA);
		System.out.println("arrB주소값 : " + arrB);
		
		//arrA와 arrB의 값 출력
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		
	}

}
