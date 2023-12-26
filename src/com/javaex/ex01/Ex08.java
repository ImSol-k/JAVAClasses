package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//형 변환 결과값 예상해보기
		
		double v01 = 5 / 4;
		//예상값 : 1.25 결과값 : 1.0
		//정수끼리 계산하면 정수값으로 나옴
		System.out.println(v01);
		
		double v02 = (double)5 / 4;
		//예상값 : 1.25 결과값 : 1.25
		System.out.println(v02);
		
		double v03 = 5 / (double)4;
		//예상값 : 1.25 결과값 : 1.25
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4;
		//예상값 : 1.25 결과값 : 1.25
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		//예상값 : 2 결과값 : 2
		//반올림없이 소수점은 버려짐
		System.out.println(v05);
				
		//이미 결과가 나온후에 강제형변환시켜도 소수점값은 안나온당..
		double v06 = (double)(5 / 4);
		System.out.println((double)v06);
		
		//double로 먼저 계산 해주고 계산값을 int로 바꿔주면 반대로도 가능
		int v07 = (int)(5 /(double)4);
		System.out.println(v07);
		
		double d = (int)1.3 + 1.8;
		System.out.println(d);
		
		int i = (int)1.3 + 4;
		System.out.println(i);
		
		float f = (int)1.3 + 1.8f;
		System.out.println(f);
		
		double dd = (double)4 % 5;
		System.out.println(dd);

	}

}
