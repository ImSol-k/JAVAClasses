package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		int[] arrB = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		arrB = arrA;
		arrA[0] = 10;
		
		System.out.println("arrA주소값 : " + arrA);
		System.out.println("arrB주소값 : " + arrB);
		
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(arrB[i] + " ");
		}
		
	}

}
