package com.javaex.ex01;

public class CircleList {
	
	private Circle[] cArr;
	private int crtPos;
	
	
	public CircleList() {
		cArr = new Circle[3];
		crtPos = 0;
	}
	
	public void add(Circle c) {
		cArr[crtPos] = c;
		crtPos += 1;
	}
	
	
	public int size() {		
		return crtPos;
	}
	
	
	public Circle get(int index) {		
		return cArr[index];
	}
	
	
}
