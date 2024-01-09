package com.javaex.ex17;

public class Ractangle {
	
	//필드
	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Ractangle(String fillColor, String lineColor, int width,  int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	//GetterSetter
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
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
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("==========================");
	}
	
	//toString
//	@Override
//	public String toString() {
//		return "[fillColor=" + fillColor + ", lineColor=" + lineColor + "] [width=" + width + ", height="
//				+ height + "]";
//	}
	
	
}
