package com.javaex.ex01;

public class DigitThread extends Thread{
	
	
	
	public void run() {
		
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
			
			try {
				//텀 만들기
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
		
}
