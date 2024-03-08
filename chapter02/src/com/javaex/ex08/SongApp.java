package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		
		Song so1 = new Song("좋은날", 2010, "아이유", 3, "Real", "이민수");
		Song so2 = new Song("거짓말", 2007, "BIGBANG", 2, "Always", "G-DRAGON");
		Song so3 = new Song("벚꽃엔딩", 2012, "버스커버스커", 4, "버스커버서크1집", "장범준 작곡");
		
		so1.showInfo();
		so2.showInfo();
		so3.showInfo();
	}

}
