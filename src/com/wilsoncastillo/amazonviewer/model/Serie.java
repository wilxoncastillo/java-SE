package com.wilsoncastillo.amazonviewer.model;

public class Serie extends Film {
	private int id;
	private int seasonQuantity;
	private Chapter[] chapters;
	
	public Serie(String title, String genre, String creator, int duration, int seasonQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.seasonQuantity = seasonQuantity;
	}

	public int getId() {
		return id;
	}

	public int getSeasonQuantity() {
		return seasonQuantity;
	}

	public void setSeasonQuantity(int seasonQuantity) {
		this.seasonQuantity = seasonQuantity;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
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
