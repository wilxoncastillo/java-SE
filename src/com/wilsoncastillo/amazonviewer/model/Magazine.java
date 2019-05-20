package com.wilsoncastillo.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	private int id;
	
	public int getId() {
		return id;
	}

	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
		// TODO Auto-generated constructor stub
	}
	
	

}
