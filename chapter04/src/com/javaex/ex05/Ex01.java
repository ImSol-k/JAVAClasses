package com.javaex.ex05;

import java.util.Set;
import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		Integer i1 = 1;
		Integer i2 = 2;
		Integer i3 = 3;
		iSet.add(i1);
		iSet.add(i2);
		iSet.add(i3);
		System.out.println("iSet.size() = " + iSet.size());
		System.out.println("toString" + iSet.toString());
		System.out.println("====================");
		
		
		for(Integer num : iSet) {
			System.out.print(num.toString() + " ");
		}
		System.out.println();
		System.out.println("====================");
		
		Integer i4 = 20;
		iSet.add(i4);
		System.out.println("iSet.size() = " + iSet.size());
		System.out.println("toString" + iSet.toString());
		
		
	}

}
