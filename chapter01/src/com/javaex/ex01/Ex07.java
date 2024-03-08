package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//형변환
		int var01 = 3 + 5;
		System.out.println(var01);
		
		//자동형변환
		//정수형과 실수형을 계산하면 더 넓은자료형으로 자동형변환한다
		//정수를 실수로 변환 후 계산됨(원래값은 건들이지 않고 계산값만 변경됨)
		int a = 3;
		double d = 3.5;
		double var02 = a + d;
		
		System.out.println(var02);
		
		//강제형변환(확대, 축소)
		//프로그래머가 강제로 형을 변경
		//값 앞에 변경할 자료형을 ()괄호 안에 입력
		
		//정수와 실수의 형변환
		//소수점을 버린값 출력
		float var03 = 25.9f;
		int var04 = (int)var03;
		
		System.out.println(var03);
		System.out.println(var04);
		
		//정수끼리의 형변환		
		//큰 자료형의 크기가 변경할 값의 크기보다 작을경우
		//어짜피 사용하지 않는 메모리였기때문에 같은 값이 나옴
		int v01 = 10;
		byte v02 = (byte)v01;
		
		System.out.println(v01);
		System.out.println(v02);
		
		//축소변환 - 줄어진 크기만큼의 값을 잃는다
		//큰 자료형의 크기가 변경할 값의 크기보다 큰 경우
		//작은값의 크기만큼 줄어들어서 다시계산됨
		int v03 = 20231221;
		byte v04 = (byte)v03;
		
		System.out.println(v03);
		System.out.println("4 = " + v04);
		
		//확대변환 - 더 큰 크기의 변수로 값을 이동하는 변환(일반적으로 안전)
		byte v05 = 10;
		int v06 = (int)v05;
				
		System.out.println(v05);
		System.out.println(v06);
		
		//정수형과 소수형의 형변환
		//실수 -> 정수
		//소수점자리 없이 출력
		double v07 = 5.23;
		int v08 = (int)v07;
		
		System.out.println(v07);
		System.out.println(v08);
		
		//정수 -> 실수
		//소수점값이 없지만 생략없이 .0으로 출력
		int v09 = 25;
		double v10 = (double)v09;
		
		System.out.println(v09);  
		System.out.println(v10);
		
		
		
	}

}
