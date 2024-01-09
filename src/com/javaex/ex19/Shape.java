package com.javaex.ex19;

public class Shape {
	
	private String lineColor;
	private String fillColor;
		
	public Shape() {
	}
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
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
	
	public void draw() {
//	    System.out.println("=====도형을 그렸습니다=========");
//	    System.out.println("면색:" + getFillColor());
//	    System.out.println("선색:" + getLineColor());
//	    System.out.println("==========================");
	}
	
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	
	
}
