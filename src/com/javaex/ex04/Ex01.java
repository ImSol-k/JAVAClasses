package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread dt = new Thread(new DigitImpl());
		Thread lt = new Thread(new LowerImpl());
		Thread ut = new Thread(new UpperImpl());
		
		
		dt.start();
		lt.start();
		ut.start();
	}

}
