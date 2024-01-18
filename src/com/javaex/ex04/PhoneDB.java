package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneDB {

	public static void main(String[] args) throws Exception {
		
		List<Person> pList = new ArrayList<Person>();
		Person ps;
		String name, ph, company;
		
		//읽기
		Reader fr = new FileReader("C:\\javaStudy\\phoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			String[] sArr = str.split(",");
			ps = new Person(sArr[0], sArr[1], sArr[2]);
			pList.add(ps);
		}
		
		//쓰기
		Writer fw = new FileWriter("C:\\javaStudy\\phoneDB_원본.txt");
		BufferedWriter bw = new BufferedWriter(fw);	
		
		//내정보 추가
		if(pList.size() < 4) {
			ps = new Person("김소리", "010-2364-3292", "02-111-333");
			pList.add(ps);
		}
		
		
		for (int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).getName() + "," + pList.get(i).getPh() + "," + pList.get(i).getCompany());
			bw.newLine();
		}
		
		
		//확인용
		System.out.println("pList.size() = " + pList.size());
		System.out.println();
		
		//출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println("이름 : " + pList.get(i).getName());
			System.out.println("전화번호 : " + pList.get(i).getPh());
			System.out.println("회사 : " + pList.get(i).getCompany());
			System.out.println();
		}

		br.close();
		bw.close();

	}

}
