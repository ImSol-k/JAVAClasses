package com.javaex.ex03;

public class DigitThreadImpl implements Runnable{
	
	
	
	public void run() {
		
		for (int i = 1; i <= 50; i++) {
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
