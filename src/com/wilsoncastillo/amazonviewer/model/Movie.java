package com.wilsoncastillo.amazonviewer.model;

import java.util.Date;

public class Movie extends Film implements IVisualizable {
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
		return 	":: Movie ::\n" +
				"Title: " + this.getTitle() + "\n" +
				"Genre: " + this.getGenre() + "\n" +
				"Year: " + this.getYear() + "\n" +
				"Creator: " + this.getCreator() + "\n" +
				"Duration: " + this.getDuration()+ "\n";
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
		if(dateF.getSeconds() > dateI.getSeconds()) {
			this.setTimeViewed(dateF.getSeconds() - dateI.getSeconds()); 
		} else {
			this.setTimeViewed(0);
		}
	}
	
}
