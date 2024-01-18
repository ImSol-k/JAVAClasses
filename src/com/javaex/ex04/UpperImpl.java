package com.javaex.ex04;

public class UpperImpl implements Runnable{
	
	
	
	public void run() {
		
		for (int i = 10; i <= 150; i++) {
			System.out.println("U : " + i);
			
			try {
				//텀 만들기
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
		
}
