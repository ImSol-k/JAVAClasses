package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//키보드에서 정수로된 돈의 액수를 입력받아 현금 몇개로 변환되는지 작성
		
		Scanner in = new Scanner(System.in);
		int mon= 0;
		int[] wonArr = new int[10];
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		//금액입력
		System.out.print("금액 : ");
		mon = in.nextInt();
		
		for(int i = 0; i < wonArray.length; i++) {
			
			//입력받은 돈이 wonArray[i]보다 큰 경우
 		if(mon >= wonArray[i]) {
 			
			//현금 몇개인지 구하기(몫)
				wonArr[i] = mon / wonArray[i];
				
				//현금 갯수만큼 입력받은돈 마이너스
				mon = mon - wonArray[i] * wonArr[i];
			}
 		
			//입력받은 돈이 wonArray[i]보다 작은경우 갯수는 0으로 맞춘다
			else {
				wonArr[i] = 0;
			}
 		
			System.out.println(wonArray[i] + "원 : " + wonArr[i] + "개");
		}
		
		in.close();
	}

}
