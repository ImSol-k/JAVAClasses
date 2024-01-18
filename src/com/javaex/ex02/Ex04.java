package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {

	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader inr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(inr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
		OutputStreamWriter outw = new OutputStreamWriter(out,"MS949");
		BufferedWriter bw = new BufferedWriter(outw);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			bw.write(str);
			bw.newLine();
			System.out.println(str);
			
		}
		
		br.close();
		bw.close();
	}

}
