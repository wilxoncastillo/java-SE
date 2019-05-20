package com.wilsoncastillo.amazonviewer.model;

public class Movie extends Film {
	private int id;
	private int timeViewed;
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}

	public void showData() {
		/*
		System.out.println("Title: " + this.title);
		System.out.println("Genre: " + this.genre);
		System.out.println("Year: " + this.year);
		System.out.println();
		*/
	}
		
	public int getId() {
		return id;
	}


	public int getTimeViewed() {
		return timeViewed;
	}


	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
}
