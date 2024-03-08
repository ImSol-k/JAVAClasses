package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws Exception{
		
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			int i =0;
			String str = br.readLine();
			System.out.print(str.charAt(i));
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
			i++;
			
		}
		
		br.close();
	}

}
