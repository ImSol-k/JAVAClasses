package com.javaxe.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		//수익을 입력받아 소득세를 계산하는 프로그램 작성
		//*세금계산법
		//*0원이상 1000만원 이하인경우 0.09 * 수익
		//*1000만원 초과 4000만원 이하인 경우 1000 * 0.09 + 0.18 * (수익 - 1000)
		//*4000만원 초과 8000만원 미만인 경우 1000 * 0.09 + 3000 * 0.18 + 0.27 * (수익 - 4000)
		//*8000만원 이상인 경우 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (수익 - 8000)
		
		
		Scanner in = new Scanner(System.in);
		float salary, result;
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금액 : ");
		salary = in.nextInt();
		
		if(salary <= 1000) {
			result = 0.09f * salary;
		}
		else if(salary > 1000 && salary <= 4000) {
			result = 1000 * 0.09f + 0.18f * (salary - 1000);
		}
		else if(salary > 4000 && salary < 8000) {
			result = 1000 * 0.09f + 3000 * 0.18f + 0.27f * (salary - 4000);
		}
		else {
			result = 1000 * 0.09f + 3000 * 0.18f + 0.36f * (salary - 8000);
		}
		
		
		System.out.println("소득세는 " +  result + " 입니다.");
		
		
		in.close();
	}

}
