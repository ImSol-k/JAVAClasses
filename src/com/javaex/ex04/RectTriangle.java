package com.javaex.ex04;

public class RectTriangle extends Shape {
    private double width;
    private double height;
    
    
    
    public RectTriangle(double width, double height) {
    	super(3);
		this.width = width;
		this.height = height;
	}
    
    
	public double getArea() {
    	return (width * height) / 2;
    }
    public double getPerimeter() {
    	
    	return width + height + Math.sqrt(Math.pow(width, 2) +Math.pow(height, 2));
    }
    
}