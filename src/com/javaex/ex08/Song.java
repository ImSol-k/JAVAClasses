package com.javaex.ex08;

public class Song {
	String title;
	String atist;
	String album;
	String composer;
	int year;
	int track;
	
	public Song(String title, int year, String atist, int track, String album) {
		this.title = title;
		this.atist = atist;
		this.album = album;
		this.year = year;
		this.track = track;
	}
	public Song(String title, int year, String atist, int track, String album, String composer) {
		this(title, year, atist, track, album);
		this.composer = composer;
	}
	
	public void showInfo() {
		System.out.println(atist + ", " + title + "(" + album + ", " + track + "번 track, " + composer + " 작곡)");
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", atist=" + atist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
}
