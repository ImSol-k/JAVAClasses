package com.javaex.ex07;

public class Point {

	private int y;
	private int x;
	String line = "=========================";

	public Point() {
		System.out.println("Point()");
	}

	public Point(int x, int y) {
		this.y = y;
		this.x = x;
		System.out.println("Point(x, y)");
	}

	public int getY() {
		if(this.y < 0) {
			return 0;
		}
		else {
			return y;
		}
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		if(this.x < 0) {
			return 0;
		}
		else {
			return x;
		}
	}

	public void setX(int x) {
		this.x = x;
	}

	public void draw() {
		System.out.println("점[x=" + getX() + ", y=" + getY() + "]을 그렸습니다");
		System.out.println(line);
	}

	public void draw(boolean action) {
		if (action == true) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다");
			System.out.println(line);
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다");
			System.out.println(line);
		}
	}

	@Override
	public String toString() {

		return "Point [y=" + y + ", x=" + x + "]";
	}

}
