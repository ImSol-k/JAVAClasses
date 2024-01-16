package com.javaex.ex02;

import java.util.Arrays;

public class MyList {
	
	private Object[] oArr;
	private int crtPos;
	
	
	public MyList() {
		oArr = new Object[3];
		crtPos = 0;
	}
	public MyList(Object[] oArr, int crtPos) {
		super();
		this.oArr = oArr;
		this.crtPos = crtPos;
	}
	
	
	public void add(Object obj) {
		oArr[crtPos] = obj;
		crtPos += 1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArr[index];
	}
	
	
	@Override
	public String toString() {
		return "MyList [oArr=" + Arrays.toString(oArr) + ", crtPos=" + crtPos + "]";
	}
	
	
	
}
