package com.javaex.ex06;

import java.util.Set;
import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
				
		Set<Integer> iSet = new HashSet<Integer>();
		int a = 0;
		
//		for (int i = 0; i < 6; i++) {
//			iSet.add((int)(Math.random() * 45) + 1);
//		}
		while(iSet.size() < 6) {
			iSet.add((int)(Math.random() * 45) + 1);
			
		}
		for(Integer i : iSet) {
			System.out.print(i.toString() + "  ");
		}
		System.out.println("\n======================");
		
		
		
		
	}

}
