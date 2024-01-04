package com.javaex.ex09;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		tv.power(true);
		tv.channel(130);
		tv.volume(80);
		
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.volume(false);
		
		tv.status();
		
		tv.volume(false);
		tv.volume(102);
		
		tv.channel(false);
		
		tv.status();
		tv.volume(false);
		tv.volume(false);
		tv.volume(false);
		tv.volume(false);
		tv.power(false);
		
		tv.status();
	}

}
