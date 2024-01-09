package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int widht;
	private int height;
	
	
	public Triangle() {
		System.out.println("생성자 Triange(0) 실행");
	}
	public Triangle(int widht, int height) {
		super("검정", "검정");
		this.widht = widht;
		this.height = height;
		System.out.println("생성자 Triange(2) 실행");
	}
	public Triangle(String fillColor, String lineColor, int widht, int height) {
		super(fillColor, lineColor);
		this.widht = widht;
		this.height = height;
		System.out.println("생성자 Triange(4) 실행");
	}
	
	
	
	
	
}


