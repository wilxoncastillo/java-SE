package com.wilsoncastillo.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable {
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	public Book(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "\n :: Magazine :: \n" +
				"Title: " + this.getTitle() + "\n" +
				"Genre: " + this.getEditorial() + "\n" +
				"Duration: " + this.getEditionDate() + "\n";
	}
	
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
		if(dateF.getSeconds() > dateI.getSeconds()) {
			this.setTimeReaded(dateF.getSeconds() - dateI.getSeconds()); 
		} else {
			this.setTimeReaded(0);
		}
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	

}
