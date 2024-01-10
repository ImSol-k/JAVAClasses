package com.javaex.ex23;

public class MyFileApp {

	public static void main(String[] args) {
		
		//정상처리
		MyFile mf1 = new MyFile();
		String str = mf1.read("c:/aaa.test");
		System.out.println(str);
		
		//원하는방식의 처리방법이 아님
		str = mf1.read2("c:/aaa.test");
		System.out.println(str);
		
		//예외상황 발생만 시키기
		try {
			
			str = mf1.read3("c:/aaa.test");
			
		} catch (Exception e) {
			System.out.println("can't find file");
		}
		
		System.out.println(str);
		
		
	}

}
