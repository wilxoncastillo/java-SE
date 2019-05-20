package com.wilsoncastillo.amazonviewer.model;

import java.util.Date;

public class Book extends Publication {
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	public Book(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}
	
	

}
