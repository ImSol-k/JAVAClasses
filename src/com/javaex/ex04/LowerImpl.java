package com.javaex.ex04;

public class LowerImpl implements Runnable{
	
	
	
	public void run() {
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("Lower : " + ch);
			
			try {
				//텀 만들기
				Thread.sleep(600);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
		
}
