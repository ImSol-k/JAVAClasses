package com.javaex.ex05;

public class SongApp {
	
	public static void main(String[] args) {
		
		Song so1 = new Song();
		so1.setSong("아이유", "좋은날");
		so1.setAlbum("Real", 2010, 3, "이민수");
		
		Song so2 = new Song();
		so2.setSong("BIGBANG", "거짓말");
		so2.setAlbum("Always", 2007, 2, "G-DRAGON");
		
		Song so3 = new Song();
		so3.setSong("버스커버스커", "벚꽃엔딩");
		so3.setAlbum("버스커버스커1집", 2012, 4, "장범준");
		
		so1.showInfo();
		so2.showInfo();
		so3.showInfo();
	}
}
