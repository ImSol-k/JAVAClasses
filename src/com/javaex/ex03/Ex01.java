package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread dt = new Thread(new DigitThreadImpl());
		dt.start();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}

}
