package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		//오류찾기
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i = 0; i <= intArray.length; i++) {
			result = result + intArray[i];
			//System.out.println(result);
		}
		
		System.out.println(result);
		
		//배열의 크기는5까지인데 <=이면 6번 반복됨 배열의 크기를 넘어가기때문에 에러
		
	}

}
