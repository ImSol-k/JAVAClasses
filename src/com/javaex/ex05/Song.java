package com.javaex.ex05;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int track;
	private int year;
	
	public void setSong(String artist, String title) {
		this.artist = artist;
		this.title = title;
		
	}
	public void setAlbum(String album, int year, int track, String composer) {
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	public void showInfo() {
		System.out.println(artist + ", " + title + "(" + album + ", " + year + ", "+ track + "번 track, "+ composer + " 작곡)");
	}
	
	
}
