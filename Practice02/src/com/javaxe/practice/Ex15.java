package com.javaxe.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		//계산기프로그램 작성
		//*기호, 숫자1, 숫자2 순서로 입력받는다
		//*기호는(+, -, *, /)4가지 사용
		//*입력된 내용으로 계산하여 결과값 출력
		//*나눗셈의 경우 분모가 0이면 "계산 할 수 없습니다" 출력
		
		Scanner in = new Scanner(System.in);
		String symbol;
		float num1, num2;
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호 : ");
		symbol = in.nextLine();
		System.out.print("숫자1 : ");
		num1 = in.nextFloat();
		System.out.print("숫자2 : ");
		num2 = in.nextFloat();
		
		
		
		switch(symbol) {
		case "+":
			System.out.println("결과는 : " + (num1 + num2));
			break;
		case "-":
			System.out.println("결과는 : " + (num1 - num2));
			break;
		case "*":
			System.out.println("결과는 : " + (num1 * num2));
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("계산 할 수 없습니다.");
			}
			else {
				System.out.println("결과는 : " + (num1 / num2));
			}
			break;
		default:
			System.out.println("계산 할 수 없는 기호입니다.");
			break;
		}
		
		
		
		in.close();
	}

}
