package com.javaex.ex18;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		//사각형
		Ractangle[] racArr = new Ractangle[3];
		Ractangle rac1 = new Ractangle("빨강", "빨강", 3, 3);
		Ractangle rac2 = new Ractangle("노랑", "연두", 5, 2);
		Ractangle rac3 = new Ractangle("파랑", "하늘", 4, 5);
		racArr[0] = rac1;
		racArr[1] = rac2;
		racArr[2] = rac3;
		
		//삼각형
		Triangle[] trArr = new Triangle[3];
		Triangle tr1 = new Triangle("빨강", "파랑", 20, 25);
		Triangle tr2 = new Triangle("하양", "검정", 15, 10);
		Triangle tr3 = new Triangle("분홍", "연두", 20, 20);
		trArr[0] = tr1;
		trArr[1] = tr2;
		trArr[2] = tr3;
		
		//원
		Circle[] ccArr = new Circle[3];
		Circle cc1 = new Circle("분홍", "하양", 20);
		Circle cc2 = new Circle("노랑", "노랑", 10);
		Circle cc3 = new Circle("하늘", "파랑", 15);
		ccArr[0] = cc1;
		ccArr[1] = cc2;
		ccArr[2] = cc3;
		
		//출력
		for (int i = 0; i < racArr.length; i++) {
			//사각형
			racArr[i].draw();
		}
		for (int i = 0; i < trArr.length; i++) {
			//삼각형
			trArr[i].draw();
		}
		for (int i = 0; i < ccArr.length; i++) {
			//원
			ccArr[i].draw();
		}
		
	}
}
