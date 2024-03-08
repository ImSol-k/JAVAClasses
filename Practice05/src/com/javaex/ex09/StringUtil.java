package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] str){
    	String sum = "";
    	for (int i = 0; i < str.length; i++) {
			sum = sum + str[i];
		}
        //메소드 내용작성
        return sum;
    }

}
