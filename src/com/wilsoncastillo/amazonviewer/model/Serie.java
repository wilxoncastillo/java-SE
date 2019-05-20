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

	
	
	
	
}
