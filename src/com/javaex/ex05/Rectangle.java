package com.javaex.ex05;

public class Rectangle {
	
	private int x, y;
	
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		
		Rectangle rac = (Rectangle)obj;
		return rac.x * rac.y == this.x * this.y;
		
	}
	
}
