package com.javaex.ex19;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		//Ractangle rac = new Ractangle("빨강", "빨강", 2, 2);
		//System.out.println(rac.getWidth());
		
		Shape[] sArr = new Shape[3];
		//업캐스팅
		Shape s1 = new Ractangle("빨강", "빨강", 2, 2);
		Shape s2 = new Triangle("파랑", "파랑", 3, 3);
		Shape s3 = new Circle("노랑", "노랑", 5);
		sArr[0] = (Ractangle)s1;
		sArr[1] = s2;
		sArr[2] = s3;
		
		//메소드 오버라이딩
		System.out.println("toString() 출력");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println("====================================================");
			System.out.println(sArr[i].toString());		
		}
		System.out.println("====================================================");
		System.out.println("\ndraw() 출력");
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].draw();
		}
		
		//강제형변환으로 자식클래스에 접근
		System.out.println("((Ractangle)sArr[0]).getHeight() = " + ((Ractangle)sArr[0]).getHeight());
		
	}
}
