package com.javaex.ex01;

import java.util.Arrays;

public class PointList {
	
	private Point[] pArr; 
	private int crtPos;
	
		
	public PointList() {
		pArr = new Point[3];
		crtPos = 0;
	}
	
	
	//List추가
	public void add(Point p) {
		pArr[crtPos] = p;
		crtPos += 1;		
	}
	
	//List크기
	public int size() {
		
		return crtPos;
	}
	
	//
	public Point get(int index) {
		
		return pArr[index];
	}
	
	
	public void pArrPrint() {
		for (int i = 0; i < crtPos; i++) {
			System.out.println("[" + i + "]x = " + pArr[i].getX() + ", y = " +  pArr[i].getY());
		}
	}


	@Override
	public String toString() {
		return "PointList [pArr=" + Arrays.toString(pArr) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
