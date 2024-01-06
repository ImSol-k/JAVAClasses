package com.javaex.ex04;

public class Base {
	
	private static String state;
    
    public void service(String state) {
    	
    	this.state = state;
    	
    	if(state.equals("낮")) {
    		day();
    	}
    	else if(state.equals("밤")) {
    		night();
    	}
    	else if(state.equals("오후")){
    		afternoon();
    	}
    	
    	
    }

    public void day() {
        System.out.println(state + "에는 열심히 수업듣자");
    }

    public void night() {
        
    	System.out.println(state + "에는 숙면");
    }
    
    public void afternoon(){
        System.out.println(state + "도 낮과 마찬가지로 공부해야 합니다.");
    }
}

