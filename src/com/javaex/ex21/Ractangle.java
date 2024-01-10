package com.javaex.ex21;

public class Ractangle extends Shape implements Drawable{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}
	public Ractangle(String lineColor, String fillColor) {
		super();
		super.setLineColor(lineColor);
		super.setFillColor(fillColor);
	}
	public Ractangle(String lineColor, String fillColor, int width,  int height) {
		super();
		super.setLineColor(lineColor);
		super.setFillColor(fillColor);
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
	
	public double area() {
		double area = width * height;		
		return area;
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
	@Override
	public String toString() {
		return "R[fillColor=" + getFillColor() + ", lineColor=" + getLineColor() + "] [width=" + width + ", height="
				+ height + "]";
	}
	
	
}
