package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {

		// print, println의 차이 - 개행여부
		String str = "안녕하세요";
		String name = "소리";
		String hello = "굿모닝";
		String s = "한";
		char c = '한';
		int i = 12345;
		double d = 3.14;

		System.out.println(i);
		System.out.println(12345);
		System.out.println(str);
		System.out.println("안녕하세요");

		System.out.print(name);
		System.out.println(str);

		System.out.print("안녕");
		System.out.println("하세요");
		System.out.println(name + "님 " + hello + hello);
		System.out.println(name + '님' + ' ' + hello + hello);
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("================================");

		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(i + d);
		System.out.println(c + c);
		System.out.println(s + s);
		// 문자열이 들어가면 전부 문자열로 인식
		System.out.println(name + i + d);
		// 숫자먼저 계산해야 계산식으로 들어감
		System.out.println(name + (i + d));
		System.out.println("================================");

		// 이스케이프 시퀀스
		// 문자열 안에서 특별한 의미로 해석되는 문자
		// \n(개행), \t(탭), \"(큰따옴표), \\(역슬래쉬)
		// 문자열은 큰따옴표사용"" 문자형은 작은따옴표사용''하기떄문에
		// 각 따옴표는 역슬래쉬 붙여서 사용해야됨
		System.out.print("안녕 나는 \"소리\"야 \\^O^/\t(<''<)" + '\'' + '"' + '\n');
		System.out.println("================================");

	}

}
