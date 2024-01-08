package com.javaex.ex16;

public class ColorPoint extends Point{
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint");
	}
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(color)");
	}
	public ColorPoint(int x, int y, String color) {		
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint(x, y, color)");
	}
	
	//GetterSetter메소드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//toString
	@Override
	public String toString() {
		return "ColorPoint [x=" + getX() + ", y=" + getY() + ", color=" + color + "]";
	}
	
		
}
