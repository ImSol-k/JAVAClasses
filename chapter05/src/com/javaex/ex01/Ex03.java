package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		//In
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		//Out
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bfimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		
		byte[] buff = new byte[1024];
		System.out.println("복사시작");
		
		while(true) {
			
			int data = bin.read(buff);
			//System.out.println(data);
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			bout.write(data);
			
		}
		
		bin.close();
		bout.close();
		
	}

}
