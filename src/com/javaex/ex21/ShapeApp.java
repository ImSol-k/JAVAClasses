package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Drawable[] sArr = new Drawable[4];
		//업캐스팅
		Drawable s1 = new Ractangle("빨강", "빨강", 2, 2);
		Drawable s2 = new Triangle("파랑", "파랑", 3, 3);
		Drawable s3 = new Circle("노랑", "노랑", 5);
		Drawable s4 = new Point(3,3);
		sArr[0] = (Ractangle)s1;
		sArr[1] = s2;
		sArr[2] = s3;
		sArr[3] = s4;
		
		//메소드 오버라이딩
		System.out.println("====toString() 출력==================================");
		for (int i = 0; i < sArr.length; i++) {			
			System.out.println(sArr[i].toString());		
		}
		System.out.println("====draw() 출력======================================");
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].draw();
		}
		System.out.println("==========================");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println("sArr[" + i + "].area() = " + sArr[i].area());
		}
		System.out.println("==========================");
		
		//다운캐스팅
		//강제형변환으로 자식클래스에 접근
		System.out.println("((Ractangle)sArr[0]).getHeight() = " + ((Ractangle)sArr[0]).getHeight());
		
	}
}
