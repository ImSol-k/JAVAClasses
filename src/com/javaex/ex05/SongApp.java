package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song so1 = new Song();so1.setArtist("아이유");
		so1.setTitle("좋은날");
		so1.setAlbum("Real");
		so1.setYear(2010);
		so1.setTrack(3);
		so1.setComposer("이민수");
//		so1.setSong("아이유", "좋은날");
//		so1.setAlbum("Real", 2010, 3, "이민수");
		
		Song so2 = new Song();
		so2.setArtist("BIGBANG");
		so2.setTitle("거짓말");
		so2.setAlbum("Always");
		so2.setYear(2007);
		so2.setTrack(2);
		so2.setComposer("G-DRAGON");
//		so2.setSong("BIGBANG", "거짓말");
//		so2.setAlbum("Always", 2007, 2, "G-DRAGON");
		
		Song so3 = new Song();
		so3.setArtist("버스커버스커");
		so3.setTitle("벚꽃엔딩");
		so3.setAlbum("버스커버스커1집");
		so3.setYear(2012);
		so3.setTrack(4);
		so3.setComposer("장범준");
//		so3.setSong("버스커버스커", "벚꽃엔딩");
//		so3.setAlbum("버스커버스커1집", 2012, 4, "장범준");
		
		System.out.println("======================================================");
		so1.showInfo();
		so2.showInfo();
		so3.showInfo();
		
		// 검사용 toString메소드로 확인하는 방법
//		System.out.println(so1.toString());
//		System.out.println(so2.toString());
//		System.out.println(so3.toString());

	}
}
