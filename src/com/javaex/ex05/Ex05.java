package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		int[] arrB = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//arrA와 arrB의 주소가 다른지 확인
		System.out.println("arrA주소값 : " + arrA);
		System.out.println("arrB주소값 : " + arrB);
		
		//주소참조가 아닌 값 복사하기
		//두 값이 같은지 확인
		for (int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		System.out.println();
		System.out.println("================");
		
		//arrA의 0번째값을 99로 변경하고 두 배열의 값이 다른지 확인
		arrA[0] = 0;
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		
	}

}
