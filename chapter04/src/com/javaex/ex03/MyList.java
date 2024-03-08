package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	
	private T[] oArr;
	private int crtPos;
	
	
	public MyList() {
		oArr = (T[])new Object[3];
		crtPos = 0;
	}
	
	
	public void add(T obj) {
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
