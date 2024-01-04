package com.javaex.ex05;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int track;
	private int year;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/*
	 * public void setSong(String artist, String title) { 
	 * this.artist = artist;
	 * this.title = title;
	 * 
	 * } public void setAlbum(String album, int year, int track, String composer) {
	 * this.album = album; 
	 * this.year = year; 
	 * this.track = track; 
	 * this.composer = composer;
	 * }
	 */
	
	public void showInfo() {		
		System.out.println(
				artist + ", " + title + "(" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
		System.out.println("======================================================");
	}
	
	//검사용 문자열
	//그래픽 작업 하기 전 값이 잘 들어가 있는지 확인용 메소드
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", track=" + track + ", year=" + year + "]";
	}

}
