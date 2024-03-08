package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] sArr;
		String calc;
		boolean start = true;
		int num1, num2;

		while (start) {
			
			//입력받기
			System.out.print(">> ");
			calc = in.nextLine();
			
			// /q를 입력받으면 종료
			if ("/q".equals(calc)) {
				System.out.println("종료합니다");
				start = false;
			} 
			
			//아니면 반복실행
			else {
				start = true;
				
				//받은 문자열을 공백으로 나눠서 배열에 저장
				sArr = calc.split(" ");	
				//문자열을 숫자로 변환
				num1 = Integer.parseInt(sArr[0]);
				num2 = Integer.parseInt(sArr[2]);
				
				//기호별 실행명령??
				switch (sArr[1]) {
				case "+":
					Add add = new Add();
					add.setValue(num1, num2);
					System.out.println(">> " + add.calculate());
					break;
				case "-":
					Sub sub = new Sub();
					sub.setValue(num1, num2);
					System.out.println(">> " + sub.calculate());
					break;
				case "*":
					Mul mul = new Mul();
					mul.setValue(num1, num2);
					System.out.println(">> " + mul.calculate());
					break;
				case "/":
					Div div = new Div();
					div.setValue(num1, num2);
					System.out.println(">> " + div.calculate());
					break;
				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			}			
		}
		
		in.close();
	}
}
