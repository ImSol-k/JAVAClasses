package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		int[] arrB = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//arrA와 arrB의 주소가 다른지 확인
		System.out.println("========================");
		System.out.println("arrA주소값 : " + arrA);
		System.out.println("arrB주소값 : " + arrB);
		System.out.println("========================");
		
		//주소참조가 아닌 값 복사하기
		//두 값이 같은지 확인
		System.out.println("두 배열의 값 복사");
		System.out.print("arrA = ");
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
		
		System.out.print("arrB = ");
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		//배열의 0번째값 변경
		arrB[0] = 0;
		
		//두 배열의 값이 다른지 확인
		System.out.println("값 변경후");
		System.out.print("arrA = ");
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
		
		System.out.print("arrB = ");
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		System.out.println();
		System.out.println("========================");
		
		
	}

}
