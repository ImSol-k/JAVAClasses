package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String line = "====================================";
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		System.out.println(".concat()");
		System.out.println("a.concat(b) = " + a.concat(b));
		System.out.println("b.concat(a) = " + b.concat(a));
		System.out.println("\"@\".concat(a).concat(b) = " + "@".concat(a).concat(b));
		System.out.println(line);
		
		//a의 값을 b와 합친결과로 바꾸기
		//a += b;
		a = a.concat(b);
		System.out.println("concat()");
		System.out.println("a.concat(b) = " + a);
		System.out.println(line);
		
		//앞부분의 공백을 잘라준다
		a = a.trim();
		System.out.println("trim()");
		System.out.println("a.trim() = " + a.trim());
		System.out.println(line);
		
		//문자열 바꾸기
		a = a.replace("ab", "12");
		System.out.println("replace()");
		System.out.println("a.replace(\"ab\", \"12\") = " + a);
		System.out.println(line);
		
		//문자열을 기준으로 나눠서 담기
		//배열로 바뀜
		// = "안녕,나는,소리야,ㅎㅎ,잘 부탁해";
		String[] sArr = a.split(",");
		System.out.println("a.split(\",\")");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println("sArr[" + i + "] = " + sArr[i]);
		}
		System.out.println("a = " + a);
		System.out.println(line);
		
		//문자열 지우기		
		String str = "Hello JAVA!";
		String result1 = str.substring(3);
		String result2 = str.substring(1, 7);
		System.out.println("substring()");
		System.out.println("result1 = " + result1);		
		System.out.println("result2 = " + result2);
		System.out.println(line);
		
		//한글자 문자만 뽑아오기
		char result3 = str.charAt(3);
		System.out.println("charAt()");
		System.out.println("result3 = " + result3);
		System.out.println(str.toString());
		System.out.println(line);
		
		//equals
		//문자열 비교
		String s1 = new String("안녕하세요");
		String s2 = new String("안녕하세요");
		//String객체끼리 비교
		System.out.print("s1.equals(s2) = " + s1.equals(s2));
		if(s1.equals(s2)) {
			System.out.println("(글자 같음)");
		}
		else {
			System.out.println("(글자 다름)");
		}
		//주소비교
		System.out.print("(s1 == s2) = " + (s1 == s2));
		if(s1 == s2){
			System.out.println("(주소 같음)");
		}
		else {
			System.out.println("(주소 다름)");
		}
		//객체와 문자열 비교
		System.out.print("\"안녕하세요\".equals(s1) = " + "안녕하세요".equals(s1));
		if("안녕하세요".equals(s1)) {
			System.out.println("(글자 같음)");
		}
		else {
			System.out.println("(글자 다름)");
		}
	}

}
