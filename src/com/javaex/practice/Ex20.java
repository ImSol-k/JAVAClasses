package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		//숨겨진 숫자 맞추기 게임
		//1~100 사이의 숫자중 임의숫자정하기
		//사용자가 입력한수가 정해진숫자보다 높으면 "더 높게"
		//사용자가 입력한수가 정해진국자보다 낮으면 "더 낮게"
		//정답을 맞춘경우"맞았습니다" 출력후 게임 재실행여부질문
		//아닌경우 실행종료, 맞는경우 재시작
		
		Scanner in = new Scanner(System.in);
		String yn;
		boolean start = true;
		int random = 25;
		int num;
		
		System.out.println("=================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("=================================");
		
		while(start) {
			System.out.print(">>");
			num = in.nextInt();
			in.nextLine();
			
			if(num > random) {
				System.out.println("더 낮게");
			}
			else if(num < random) {
				System.out.println("더 높게");
			}
			else if(num == random){
				
				System.out.println("맞았습니다");
				while (start) {
					System.out.print("게임을 종료하시겠습니까?(y/n) >> ");
					yn = in.nextLine();

					if (yn.equals("y")) {
						System.out.println("=================================");
						System.out.println("\t[숫자맞추기게임 종료]");
						System.out.println("=================================");
						start = false;
						break;
					} 
					else if (yn.equals("n")) {
						System.out.println("=================================");
						System.out.println("\t[숫자맞추기게임 시작]");
						System.out.println("=================================");
						start = true;
						break;
					} 
					else {
						System.out.println("잘못입력하셨습니다.");
						start = true;
					}
				}
			}
		}
		in.close();

	}

}
