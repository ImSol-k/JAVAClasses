package com.javaex.ex22;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] iArr = new int[] {3, 6, 9};
		
		try {
			for (int i = 0; i < iArr.length + 1; i++) {
				System.out.print(iArr[i] + " ");
			}
		}catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println();
			System.out.println(arr.toString());
			System.out.println("배열의 범위를 벗어나 강제종료 합니다.");
		}
		
	}

}
