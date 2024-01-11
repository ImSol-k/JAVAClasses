package com.javaex.ex08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] sArr = new String[3];
		Friend[] fArr = new Friend[3];
		String[] arr = new String[3];
				
		System.out.println("친구 3명 등록해주세요");
		for (int i = 0; i < sArr.length; i++) {
			sArr[i]= in.nextLine();
			arr = sArr[i].split(" ");
			fArr[i] = new Friend(arr[0], arr[1], arr[2]);
		}
		for (int i = 0; i < fArr.length; i++) {
			fArr[i].showInfo();
		}
		
		
		
		
		in.close();
	}

}
