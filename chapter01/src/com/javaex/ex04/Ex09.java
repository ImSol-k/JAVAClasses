package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		
		//6의 배수이자 14의 배수인 가장 작은수 찾기
		
		int num = 1;
		
		while(true) {
								
			if(num % 6 == 0 && num % 14 == 0) {				
				System.out.println(num);
				break;
			}
			
			num++;
		}
						
	}

}
