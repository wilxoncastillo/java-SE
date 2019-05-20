package com.wilsoncastillo.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	private int id;
	
	public int getId() {
		return id;
	}

	public Magazine(String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		String datailBook =  "\n :: Book :: \n" +
				"Title: " + this.getTitle() + "\n" +
				"Genre: " + this.getEditorial() + "\n" +
				"Duration: " + this.getEditionDate() + "\n" +
				"Autores: ";
	
		for (int i = 0; i < getAuthors().length; i++) {
			datailBook += "\t" + getAuthors()[i]; 
		}
		
		return datailBook;
	}

}
