package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		//동전별 개수를 입력받아 총 금액을 계산하는 프로그램 작성
		Scanner in = new Scanner(System.in);
		int ten, tenResult;
		int fifty, fiftyResult;
		int hundread, hundreadResult;
		int fiveHundread, fiveHundreadResult;
		int result;
		
		System.out.print("500원 개수 : ");
		fiveHundread = in.nextInt();
		fiveHundreadResult = fiveHundread * 500;
		
		System.out.print("100원 개수 : ");
		hundread = in.nextInt();
		hundreadResult = hundread * 100;
		
		System.out.print("50원 개수  : ");
		fifty = in.nextInt();
		fiftyResult = fifty * 50;
		
		System.out.print("10원 개수  : ");
		ten = in.nextInt();
		tenResult = ten * 10;
		
		result = fiveHundreadResult + hundreadResult + fiftyResult + tenResult;
		
		System.out.println("동전의 총 합은 " + result + "원 입니다.");
		
		in.close();

	}

}
