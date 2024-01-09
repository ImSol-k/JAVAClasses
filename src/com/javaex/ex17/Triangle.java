package com.javaex.ex17;

public class Triangle {
	
	//필드
	private String lineColor;
	private String fillColor;
	private int widht;
	private int height;
	
	//생성자
	public Triangle() {
	}
	public Triangle(String lineColor, String fillColor, int widht, int height) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.widht = widht;
		this.height = height;
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
	    System.out.println("면색:" + fillColor);
	    System.out.println("선색:" + lineColor);
	    System.out.println("==========================");
	}
	
	@Override
	public String toString() {
		return "Tiangle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", widht=" + widht + ", height="
				+ height + "]";
	}
	
	
}
