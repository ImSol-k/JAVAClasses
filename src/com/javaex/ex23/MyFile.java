package com.javaex.ex23;

import java.io.IOException;

public class MyFile {
	
	//파일이 있는 경우
	public String read(String path) {
		
		//path에 있는 파일을 읽어왔다고 가정
		String result = "학교종이 떙땡땡 어서 모이자";
		return result;
	}

	//파일이 없는 경우
	//만드는쪽에서 처리
	public String read2(String path) {

		// path에 있는 파일을 읽어왔다고 가정
		String result = "";
		try {
			//강제 예외처리
			throw new IOException();
			
		} catch (IOException e) {
			System.out.println("파일의 경로를 찾을 수 없습니다.");
		}
		
		
		return result;
	}
	
	//사용하는쪽에 넘겨주기
	public String read3(String path) throws IOException {
		String result = "";
		
		//강제 예외처리
		throw new IOException();
		
		//강제로 에러를 발생시켰기때문에 return을 할 수 없음
		//return result;
	}
	
	
	
}
