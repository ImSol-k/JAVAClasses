package com.javaxe.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		//키와 몸무게를 입력받아 표준체중을 계산한 후
		//저체중, 표준, 과페중을 구분하여 출력하세요
		
		Scanner in = new Scanner(System.in);
		float bmi, cm, kg, m, standard;
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 : ");
		cm = in.nextFloat();
		System.out.print("몸무게 : ");
		kg = in.nextFloat();
		
		m = cm / 100;
		
		bmi = kg / (cm * cm);
		
		if(bmi >= 0 && bmi < 18.5) {
			System.out.println("저체중 입니다.");
			standard = (m * m) * 22;
		}
		else if(bmi > 18.5 && bmi < 23) {
			System.out.println("표준 입니다.");
			standard = (m * m) * 22;
		}
		else if(bmi > 23.0 && bmi < 25) {
			System.out.println("과체중 입니다.");
			standard = (m * m) * 22;
		}
		else {
			System.out.println("비만입니다");
			standard = (m * m) * 22;
		}
		System.out.println("표준체중 : " + standard);
		
		in.close();
		
	}

}
