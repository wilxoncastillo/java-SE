package com.wilsoncastillo.amazonviewer.model;

public class Chapter extends Movie {
	private int id;
	private int seasonNumber;

	
	@Override
	public int getId() {
		return this.id;
	}
	
	public Chapter(String title, String genre, String creator, int duration, short year, int seasonNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSeasonNumber(seasonNumber);
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	@Override
	public String toString() {
		return "Title: " + this.getTitle() + "\n" +
				"Genre: " + this.getGenre() + "\n" +
				"Year: " + this.getYear() + "\n" +
				"Creator: " + this.getCreator() + "\n" +
				"Duration: " + this.getDuration()+ "\n" +
				"Season: " + this.getSeasonNumber() + "\n";
	}

}
