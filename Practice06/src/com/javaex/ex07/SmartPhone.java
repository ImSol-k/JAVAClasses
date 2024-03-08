package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if(str.equals("앱")) {
    		appStart();
    	}
    	else if(str.equals("통화")) {
    		super.execute(str);
    	}
    	else {
    		musicDownload();
    	}
    }
 
    //메소드작성
    public void appStart() {
    	System.out.println("앱실행");
    }
    
    //메소드작성
    public void musicDownload() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    
}
