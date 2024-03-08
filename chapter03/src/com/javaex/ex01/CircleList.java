package com.javaex.ex01;

import java.util.Arrays;

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

	
	public void showInfo() {
		for (int i = 0; i < crtPos; i++) {
			System.out.println("[" + i + "]radius = " + cArr[i].getRadius());
		}
	}
	
	
	@Override
	public String toString() {
		return "CircleList \n" + Arrays.toString(cArr) + ", crtPos=" + crtPos;
	}
	
	
	
	
	
}
