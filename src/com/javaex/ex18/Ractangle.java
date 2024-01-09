package com.javaex.ex18;

public class Ractangle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}
	public Ractangle(String lineColor, String fillColor, int width,  int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}
	
	//GetterSetter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("가로:" + width);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + getFillColor());
	    System.out.println("선색:" + getLineColor());
	    System.out.println("==========================");
	}
	
	//toString
//	@Override
//	public String toString() {
//		return "[fillColor=" + fillColor + ", lineColor=" + lineColor + "] [width=" + width + ", height="
//				+ height + "]";
//	}
	
	
}
