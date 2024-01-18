package com.javaex.ex02;

public class LowerThread extends Thread{
	
	
	public void run() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println("Lower : " + i);
			
			try {
				//텀 만들기
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
	}
	
		
}
