package com.javaex.ex17;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		//사각형
		Ractangle[] racArr = new Ractangle[3];
		Ractangle rac1 = new Ractangle("파랑", "빨강", 5, 10);
		Ractangle rac2 = new Ractangle("노랑","노랑", 30, 20);
		Ractangle rac3 = new Ractangle("하양", "분홍", 20, 20);
		racArr[0] = rac1;
		racArr[1] = rac2;
		racArr[2] = rac3;
		
		//삼각형
		Triangle[] trArr = new Triangle[3];
		Triangle tr1 = new Triangle("빨강", "파랑", 20, 10);
		Triangle tr2 = new Triangle("노랑", "하늘", 10, 15);
		Triangle tr3 = new Triangle("하양", "분홍", 30, 10);
		trArr[0] = tr1;
		trArr[1] = tr2;
		trArr[2] = tr3;
		
		//원
		Circle[] ccArr = new Circle[3];
		Circle cc1 = new Circle("분홍", "빨강", 20);
		Circle cc2 = new Circle("하늘", "파랑", 10);
		Circle cc3 = new Circle("연두", "노랑", 35);
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
