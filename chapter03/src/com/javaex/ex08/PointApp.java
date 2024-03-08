package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point po1 = new Point(5, 23);
		Point po2 = new Point(2, 2);
		Point po3 = new Point(3, 3);
		pMap.put("이준기", po1);
		pMap.put("이효리", po2);
		pMap.put("이수근", po3);
		
		System.out.println(pMap.toString());
		System.out.println("pMap.size() = " + pMap.size());		
		System.out.println("pMap.get(\"이준기\").getY() = " + pMap.get("이준기").getY());		 
		System.out.println("keySet " + pMap.keySet());
		System.out.println("============================");
		
//		Point po4 = new Point(100, 100);
//		pMap.put("이효리", po4);
//		System.out.println(pMap.toString());
//		System.out.println("============================");
//		
		
		Set<String> keys = pMap.keySet();
		for(String str : keys) {
			System.out.println(str + "[x=" + pMap.get(str).getX() + ", y=" + pMap.get(str).getY() + "]");
		}
		
		
	}

}
