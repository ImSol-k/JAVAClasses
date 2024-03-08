package com.javaex.ex18;

public class Triangle extends Shape {
	
	//필드
	private int widht;
	private int height;
	
	//생성자
	public Triangle() {
	}
	public Triangle(String lineColor, String fillColor, int widht, int height) {
		super(lineColor, fillColor);
		this.widht = widht;
		this.height = height;
	}
	
	//GetterSetter
	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		this.widht = widht;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//출력
	public void draw() {
	    System.out.println("====삼각형을 그렸습니다=========");
	    System.out.println("가로:" + widht);
	    System.out.println("세로:" + height);
	    System.out.println("면색:" + getFillColor());
	    System.out.println("선색:" + getLineColor());
	    System.out.println("==========================");
	}
	
	@Override
	public String toString() {
		return "Tiangle [lineColor=" + getLineColor() + ", fillColor=" + getFillColor() + ", widht=" + widht + ", height="
				+ height + "]";
	}
	
	
}
