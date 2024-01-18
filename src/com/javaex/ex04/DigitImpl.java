package com.javaex.ex04;

public class DigitImpl implements Runnable{
	
	
	
	public void run() {
		
		for (int i = 1; i <= 30; i++) {
			System.out.println("Digit : " + i);
			
			try {
				//텀 만들기
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
		
}
