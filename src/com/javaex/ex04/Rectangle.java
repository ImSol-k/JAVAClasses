package com.javaex.ex04;

public class Rectangle {
	
	private int x, y;
	
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		
		Rectangle rac = (Rectangle)obj;
		
		return this.x == rac.x && this.y == rac.y;
		
	}
	
}
