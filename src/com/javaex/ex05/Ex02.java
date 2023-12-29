package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		//배열(Array)
		
		int[] intArray = new int[5];
		int a = 0;
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 15;
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("===============");
		
		for(int i = 0; i < intArray.length; i++) {
			
			intArray[i] = (int)(Math.random() * 45) + 1;
			
			if(a == intArray[i]) {
				continue;
			}
			
			System.out.print(intArray[i] + " ");
			a = intArray[i];
			
		}
		
	}

}
