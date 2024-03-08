package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		
		//두가지의 생성자 사용 방법
		//기본 생성자 사용
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		//부가적인 일을 해주는 생성자 사용
		//생성자생성과 동시에 메모리에 데이터를 올려주는형식
		Goods computer = new Goods("LG그램");
		computer.setPrice(900000);
		//기본생성자와 같은방법으로 값을 바꿔 줄 수 있다
		Goods cup = new Goods("머그컵", 2000);
		cup.setName("머그");
		
		System.out.println(camera.toString());
		System.out.println(computer.toString());
		System.out.println(cup.toString());
	}

}
