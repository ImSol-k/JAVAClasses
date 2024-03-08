package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성
	public void service(String state) {

		if (state.equals("낮")) {
			day();
		} 
		else if (state.equals("밤")) {
			night();
		} 
		else {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}
	}
	
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }
}
