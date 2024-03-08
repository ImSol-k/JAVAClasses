package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\phoneDB_원본.txt");
		InputStreamReader inr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(inr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\phoneDB_원본_copy.txt");
		OutputStreamWriter outw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(outw);
				
		String[] strArr;
		String name, hp, company;
		
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			bw.write(str);
			bw.newLine();
			
			
			strArr = str.split(",");
			name = strArr[0];
			hp = strArr[1];
			company = strArr[2];
			
			System.out.println("이름 : " + name);
			System.out.println("핸드폰 : " + hp);
			System.out.println("회사 : " + company);
			System.out.println(" ");
			
		}
			
			
		br.close();
		bw.close();
		
	}

}
