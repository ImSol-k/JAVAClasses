package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] sArr;
		String calc;
		boolean start = true;
		int num1, num2;

//		for (int i = 0; i < sArr.length; i++) {
//			if ("+".equals(sArr[i])) {
//				sym = "+";
//			} else if ("-".equals(sArr[i])) {
//				sym = "-";
//			} else if ("*".equals(sArr[i])) {
//				sym = "*";
//			} else if ("/".equals(sArr[i])) {
//				sym = "/";
//			} else {
//				sym = sArr[i];
//			}
//
//		}

		while (start) {
			System.out.print(">> ");
			calc = in.nextLine();
			if ("/q".equals(calc)) {
				start = false;
			} 
			else {
				start = true;
				sArr = calc.split(" ");
				num1 = Integer.parseInt(sArr[0]);
				num2 = Integer.parseInt(sArr[2]);
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
		System.out.println("종료합니다");
		
		in.close();
	}
}
