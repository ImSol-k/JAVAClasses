package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		//예금임력시 예금액 합산
		//출금입력시 예금액 차감
		//잔고입력시 잔고 출력
		//종료선택시 종료
		//그외 입력시 "다시 입력해주세요"메세지 출력
		
		Scanner in = new Scanner(System.in);
		int num, inMon, outMon, mon = 0;
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			num = in.nextInt();
			if(num == 1) {
				System.out.print("예금액>");
				inMon = in.nextInt();
				mon = inMon + mon;
			}
			else if(num == 2) {
				System.out.print("출금액>");
				outMon = in.nextInt();
				mon = mon - outMon;
			}
			else if(num == 3) {
				System.out.println("잔고액>" + mon);
			}
			else if(num == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("다시 입력해주세요");
			}
				
			
			
		}
		
		in.close();
	}

}
