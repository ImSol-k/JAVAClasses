package com.javaex.ex09;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	//GetterSetter메소드
	public int getChannel() {
		if(channel < 1) {
			this.channel = 1;
			return channel;
		}
		else if(channel > 255) {
			this.channel = 255;
			return channel;
		}
		else {
			return channel;
		}		
	}
	public int getVolume() {
		if(volume < 0) {
			this.volume = 0;
			return volume;
		}
		else if(volume > 100) {
			this.volume = 100;
			return volume;
		}
		else {
			return volume;
		}
	}
	public boolean getPower() {
		return power;
	}
	
	//증감처리
	public void channel(boolean channel) {
		if(channel == true) {
			this.channel ++;
		}
		else {
			this.channel --;
		}
	}
	public void volume(boolean volume) {
		if(volume == true) {
			this.volume ++;
		}
		else {
			this.volume --;
		}
	}
	
	//오버로딩
	public void channel(int channel) {
		this.channel = channel;
	}
	public void volume(int volume) {
		this.volume = volume;
	}
	public void power(boolean power) {
		this.power = power;
	}
	
	//출력
	public void status() {
		System.out.println("채널 : " + getChannel() + " / 볼륨 : " + getVolume() + " / 파워 : " + getPower());
	}
	
}
