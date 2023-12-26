package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		//총 금액을 입력하면 밷ㄱ원단위는 할인을 해주고 있습니다.
		//실제 지불금액을 출력하는 코드를 작성하세요
		
		Scanner in = new Scanner(System.in);
		int allAmount, amount;
		
		System.out.print("전체 금액을 입력해 주세요 : ");
		allAmount = in.nextInt();
		amount = (allAmount / 1000) * 1000;
		
		System.out.println("실제지불금액은 " + amount + "입니다.");
		
		in.close();
		
	}

}
