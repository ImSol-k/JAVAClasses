package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		//배열 2개를 선언하고 동일한지 비교해보기
		//배열선언
		int[] leftArray = new int[] {10, 20, 30, 40, 50};
		int[] rightArray = new int[] {11, 20, 33, 40, 55};
		
		//두 배열의 크기가 같은지 비교하는 boolean
		boolean arr = true;
		
		
		for (int i = 0; i < rightArray.length; i++) {
			
			//두 배열의 크기가 같으면 arr는 true
			if(leftArray[i] == rightArray[i]) {
				arr = true;
			}
			
			//같지 않으면 몇번째 값이 다른지 출력후 arr는 false
			else {
				System.out.println(i + "번째 값이 다릅니다");
				arr = false;
			}
		}
		
		//arr가 참일때 출력
		if(arr == true) {
			System.out.println("두 배열의 크기가 같습니다");
		}//arr가 거짓일때 출력
		else {
			System.out.println("두 배열의 크기가 다릅니다");
		}
	}

}
