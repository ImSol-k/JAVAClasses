package com.javaex.ex02;

public class UpperThread extends Thread{
	
	
	
	public void run() {
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("Upper : " + ch);
			
			try {
				//텀 만들기
				Thread.sleep(300);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
		
}
