package com.wilsoncastillo.amazonviewer;
import java.util.Date;

import com.wilsoncastillo.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("Coco", "Animation", "???", 120, (short) 2017);
		System.out.println(movie.toString());
		
		//showMenu();
	}

	public static void showMenu() {
		int exit = 0;
					
		do {			
			System.out.println("BIENENIDOS AMAZON VIEWER");
			System.out.println();
			System.out.println("Seleccione el número de la opcion deseada ");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
						
			int response = 1;
			
			switch (response) {
				case 0:
					exit = 0;
					//sc.close();
					break;	
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				
				default:
					// Date date = new date()
					makeReport(new Date());
					break;
			}
			
		}while(exit !=0);
	} 

	public static void showMovies() {
		int exit = 0;
		
		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showSeries() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showChapters() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Chapters ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showBooks() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void showMagazines() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Magazines ::");
			System.out.println();
		}while(exit !=0);
	}
	
	public static void makeReport() {
		
	}
	
	public static void makeReport(Date date) {
		
	}

}
	