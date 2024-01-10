package com.javaex.ex20;

public abstract class Shape {
	
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
	
	//추상화
	public abstract double area();
	
	public abstract void draw();
	
	//toString
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	
	
}
