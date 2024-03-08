package com.javaex.ex22;

public class NullExceprion {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 2);
		p1.draw();
		
		Point p2;
		
		//주소가 안들어왔을때
		p2 = null;
		
		try {
			p2.draw();
		}catch(NullPointerException e) {
			System.out.println("주소값이 없습니다.");
			System.out.println(e.getMessage());
		}finally {
			p2 = new Point(100, 100);
			p2.draw();
		}
		System.out.println("종료");
		
	}

}
