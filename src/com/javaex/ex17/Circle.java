package com.javaex.ex17;

public class Circle {
	
	//필드
	private String lineColor;
	private String fillColor;
	private int radius;
	
	//생성자
	public Circle() {
	}
	public Circle(String lineColor, String fillColor, int radius) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}
	
	//GetterSetter
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//출력
	public void draw() {
	    System.out.println("======원을 그렸습니다=========");
	    System.out.println("지름:" + radius);
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("==========================");
	}
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius + "]";
	}
	
	
	
}
