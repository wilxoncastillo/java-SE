package com.wilsoncastillo.amazonviewer.model;

public class Movie extends Film {
	private int id;
	private int timeViewed;
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
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
	
	@Override
	public String toString() {
		return "Title: " + this.getTitle() + "\n" +
				"Genre: " + this.getGenre() + "\n" +
				"Year: " + this.getYear() + "\n" +
				"Creator: " + this.getCreator() + "\n" +
				"Duration: " + this.getDuration()+ "\n";
	}
	
}
