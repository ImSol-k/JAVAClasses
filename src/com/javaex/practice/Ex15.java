package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		//숫자 한개를 입력받아 입력한 수의 약수 모두 출력
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하세요");
		num = in.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		
		
		in.close();
	}

}
