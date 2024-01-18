package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread dt = new DigitThread();
		Thread lt = new LowerThread();
		Thread ut = new UpperThread();
		
		dt.start();
		lt.start();
		ut.start();
		
	}

}
