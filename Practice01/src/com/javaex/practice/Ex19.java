package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		
		//아래 프로그램의 결과를 코드작성전에 먼저 예쌍해보고 코드를 확인해보세요
		
		int num01 = 40;
		int num02 = 50;
		int result = (num01++) + (++num02);
		
		System.out.println(result);
		//예상 : 41 + 51
		//예상값 : 92, 결과값 : 91
		//int result는 출력이아니라 선언후 대입한거기때문에 result출력 후 num01이 계산된다..?
		
		System.out.println(num01);
		//예상 : 40 + 1
		//예상값 : 41, 결과값 : 41
				
		System.out.println(num02);
		//예상 : 50 + 1
		//예상값 : 51, 결과값 : 51
				
		
	}

}
