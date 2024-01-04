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

	public int getChannel() {
		if(channel < 1) {
			return 1;
		}
		else if(channel > 255) {
			return 255;
		}
		else {
			return channel;
		}		
	}

	public int getVolume() {
		if(volume < 1) {
			return 1;
		}
		else if(volume > 100) {
			return 100;
		}
		else {
			return volume;
		}
	}

	public boolean getPower() {
		return power;
	}
	
	public void channel(boolean channel) {
		if(channel == true) {
			this.channel ++;
		}
		else {
			this.channel --;
		}
	}
	public void channel(int channel) {
		this.channel = channel;
	}
	public void volume(boolean volume) {
		if(volume == true) {
			this.volume ++;
		}
		else {
			this.volume --;
		}
	}
	public void volume(int volume) {
		this.volume = volume;
	}
	public void power(boolean power) {
		this.power = power;
	}
	
	public void status() {
		System.out.println("채널 : " + getChannel() + " / 볼륨 : " + getVolume() + " / 파워 : " + getPower());
	}
	
}
