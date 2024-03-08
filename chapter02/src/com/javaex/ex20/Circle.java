package com.javaex.ex20;

public class Circle extends Shape {
	
	//필드
	private int radius;
	
	//생성자
	public Circle(String lineColor, String fillColir, int radius) {
		super(lineColor, fillColir);
		this.radius = radius;
	}
	
	public double area() {
		double area = radius * radius * 3.14;		
		return area;
	}
	
	//GetterSetter
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
	    System.out.println("면색:" + getFillColor());
	    System.out.println("선색:" + getLineColor());
	    System.out.println("==========================");
	}
	
	//toString
	@Override
	public String toString() {
		return "C[lineColor=" + getLineColor() + ", fillColor=" + getFillColor() + "] [radius=" + radius + "]";
	}
	
	
	
}
