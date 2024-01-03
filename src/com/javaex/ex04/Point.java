package com.javaex.ex04;

public class Point {
	
	private int x;
	private int y;
	
	//x,y값 받아오는 메소드
	public void getX(int x) {
		this.x = x;
	}
	public void getY(int y) {
		this.y = y;
	}
	
	//출력메소드
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다");
	}
	
}
