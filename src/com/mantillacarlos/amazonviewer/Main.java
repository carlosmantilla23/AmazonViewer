package com.mantillacarlos.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.carlosmantilla.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		
		showMenu();

	}

	public static void showMenu() {

		int exit = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada:");
			System.out.println("1 - Movies");
			System.out.println("2 - Series");
			System.out.println("3 - Books");
			System.out.println("4 - Magazines");
			System.out.println("5 - Report");
			System.out.println("6 - Report Today");
			System.out.println("0 - Salida");

			// Leer la respuesta del usuario:
			int response = sc.nextInt();
			switch (response) {
			case 1:
				showMovies();
				break;
			case 2:
				System.out.println("SERIES: ");
				showSeries();
				break;
			case 3:
				System.out.println("BOOKS: ");
				showBooks();
				break;
			case 4:
				System.out.println("MAGAZINES: ");
				showMagazines();
				break;
			case 5:
				System.out.println("REPORT: ");
				makeReport();
				break;
			case 6:
				System.out.println("REPORT TODAY: ");
				Date date = new Date();
				makeReport(date);
				break;
			default:
				System.out.println(":::::SELECCIONA UNA OPCIÓN:::::");
				break;
			}

		} while (exit != 0);

	}

	public static void showMovies() {

		int exit = 1;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println("");
			System.out.println(":::MOVIES:::");
			System.out.println("");
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTittle() +" "+ " Visto: "+ movies.get(i).isViewed());
				
			}
			System.out.println("0. Regresar al menú");
			System.out.println();
			
			Scanner sc = new Scanner (System.in);
			int response = sc.nextInt();
			
			if (response == 0) {
				showMenu();
			}
			
			Movie movieSelected = movies.get(response-1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.startToSee(new Date());
			
			for (int i = 0; i < 10000; i++) {
				System.out.println("...................................................");
			}
			//Terminar de verla
			movieSelected.stopToSee(dateI, new Date());
			System.out.println("");
			System.out.println("");
			System.out.println("Viste "+movieSelected);
			System.out.println("Por "+movieSelected.getTimeViewed()/1000+" segundos");
			//System.out.println("Estuviste viendo la peícula "+movies.get(i)+ "por: "+(movieSelected.getTimeViewed())/1000+" segundos");
			
		} while (exit != 0);

	}

	public static void showSeries() {

		int exit = 0;

		do {
			System.out.println("");
			System.out.println(":::SERIES:::");
			System.out.println("");
		} while (exit != 0);

	}

	public static void showBooks() {

		int exit = 0;

		do {
			System.out.println("");
			System.out.println(":::BOOKS:::");
			System.out.println("");
		} while (exit != 0);

	}

	public static void showMagazines() {

		int exit = 0;

		do {
			System.out.println("");
			System.out.println(":::MAGAZINES:::");
			System.out.println("");
		} while (exit != 0);

	}

	public static void showChapters() {

		int exit = 0;

		do {
			System.out.println("");
			System.out.println(":::CHAPTERS:::");
			System.out.println("");
		} while (exit != 0);

	}
	
	public static void makeReport() {
		
	}
	//Sobrecarga de método
	public static void makeReport(Date date) {
		
	}

}
