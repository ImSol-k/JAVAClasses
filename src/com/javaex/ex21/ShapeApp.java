package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Drawable[] dArr = new Drawable[4];
		Drawable d1 = new Ractangle("빨강", "빨강", 2, 2);
		Drawable d2 = new Triangle("파랑", "파랑", 3, 3);
		Drawable d3 = new Circle("노랑", "노랑", 5);
		Drawable d4 = new Point(3,3);
		dArr[0] = d1;
		dArr[1] = d2;
		dArr[2] = d3;
		dArr[3] = d4;
		
		for (int i = 0; i < dArr.length; i++) {
			dArr[i].draw();
		}
		System.out.println("==========================");
		
		for (int i = 0; i < dArr.length; i++) {
			
			//예외처리 
			//dArr[i]가 Point가 아니면
			if (!(dArr[i] instanceof Point)) {
				System.out.println("dArr[" + i + "].area() = " + ((Shape) dArr[i]).area());
			}
		}
		System.out.println("==========================");
		
		for (int i = 0; i < dArr.length; i++) {
			if(dArr[i] instanceof Ractangle) {
				System.out.println("((Ractangle)dArr[i]).getHeight() = " + ((Ractangle)dArr[i]).getHeight());
			}
			else if(dArr[i] instanceof Triangle) {
				System.out.println("((Triangle)dArr[i]).getHeight() = " + ((Triangle)dArr[i]).getHeight());
			}
			else if(dArr[i] instanceof Circle) {
				System.out.println("((Circle)dArr[i]).getRadius() = " + ((Circle)dArr[i]).getRadius());
			}
			else if(dArr[i] instanceof Point) {
				System.out.println("((Point)dArr[i]).getX() = " + ((Point)dArr[i]).getX() + "\n((Point)dArr[i]).getY()" + ((Point)dArr[i]).getY());
			}
		}
		
		
	}
}
