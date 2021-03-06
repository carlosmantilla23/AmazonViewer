package com.carlosmantilla.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.carlosmantilla.amazonviewer.model.Book;
import com.carlosmantilla.amazonviewer.model.Chapter;
import com.carlosmantilla.amazonviewer.model.Magazine;
import com.carlosmantilla.amazonviewer.model.Movie;
import com.carlosmantilla.amazonviewer.model.Serie;
import com.carlosmantilla.amazonviewer.util.AmazonUtil;
import com.carlosmantilla.makereport.Report;

/**
 * <h1>Amazon Viewer</h1> AmazonViewer es un programa que permite visualizar
 * Movies, Series con sus respetivos Chapters, Books y Magazines.
 * <p>
 * Existen algunas reglas como todos los elementos pueden ser visualizados o
 * leídos a excepción de las Magazines, estas sólo pueden ser vistas a modo de
 * exposición sin ser leídas.
 * 
 * @author carlosmantilla
 * @version 1.1
 * @since 2019
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();

	}

	public static void showMenu() {
		int exit = 0;
		do {

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");

			// Leer la respuesta del usuario
			int response = AmazonUtil.validateUserResponseMenu(0, 6);

			switch (response) {
			case 0:
				// salir
				exit = 0;
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
				exit = 1;
				break;
			case 6:
				// Date date = new Date();
				try {
					Scanner sc = new Scanner(System.in);
					System.out.print("Digite la fecha del reporte a generar en formato yyyy-MM-dd: ");
					Date dateE = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
					makeReport(dateE);
				} catch (Exception e) {
					e.printStackTrace();
				}
				exit = 1;
				break;

			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción!!....");
				System.out.println();
				exit = 1;
				break;
			}

		} while (exit != 0);
	}

	static ArrayList<Movie> movies = new ArrayList<Movie>();

	public static void showMovies() {
		movies = Movie.makeMoviesList();
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			AtomicInteger atomicInteger = new AtomicInteger(1);
			movies.forEach(m -> System.out.println(atomicInteger.getAndIncrement()+". "+m.getTittle() + " Visto: " + m.isViewed()));

//			for (int i = 0; i < movies.size(); i++) { // 1. Movie 1
//				System.out.println(i + 1 + ". " + movies.get(i).getTittle() + " Visto: " + movies.get(i).isViewed());
//			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, movies.size());

			if (response == 0) {
				exit = 0;
				showMenu();
				break;
			}
			if (response > 0) {
				Movie movieSelected = movies.get(response - 1);
				movieSelected.view();

			}

		} while (exit != 0);

	}

	static ArrayList<Serie> series = Serie.makeSeriesList();

	public static void showSeries() {
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();

			for (int i = 0; i < series.size(); i++) { // 1. Serie 1
				System.out.println(i + 1 + ". " + series.get(i).getTittle() + " Visto: " + series.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, series.size());

			if (response == 0) {
				exit = 0;
				showMenu();
			}

			if (response > 0) {
				showChapters(series.get(response - 1).getChapters());
			}

		} while (exit != 0);
	}

	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();

			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { // 1. Chapter 1
				System.out.println(i + 1 + ". " + chaptersOfSerieSelected.get(i).getTittle() + " Visto: "
						+ chaptersOfSerieSelected.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, chaptersOfSerieSelected.size());

			if (response == 0) {
				exit = 0;
			}

			if (response > 0) {
				Chapter chapterSelected = chaptersOfSerieSelected.get(response - 1);
				chapterSelected.view();
			}
		} while (exit != 0);
	}

	static ArrayList<Book> books = Book.makeBookList();

	public static void showBooks() {
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();

			for (int i = 0; i < books.size(); i++) { // 1. Book 1
				System.out.println(i + 1 + ". " + books.get(i).getTitle() + " Leído: " + books.get(i).isReaded());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, books.size());

			if (response == 0) {
				exit = 0;
				showMenu();
			}

			if (response > 0) {
				Book bookSelected = books.get(response - 1);
				bookSelected.view();
			}

		} while (exit != 0);
	}

	public static void showMagazines() {
		ArrayList<Magazine> magazines = Magazine.makeMagazineList();
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();

			for (int i = 0; i < magazines.size(); i++) { // 1. Book 1
				System.out.println(i + 1 + ". " + magazines.get(i).getTitle());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			// Leer Respuesta usuario
			int response = AmazonUtil.validateUserResponseMenu(0, 0);

			if (response == 0) {
				exit = 0;
				showMenu();
			}

		} while (exit != 0);
	}

	public static void makeReport() {

		Report report = new Report();
		report.setNameFile("reporte");
		report.setExtension("txt");
		report.setTittle(":: VISTOS ::");
		StringBuilder contentReport = new StringBuilder();

		//Stream y Filter
		movies.stream()
		.filter(m -> m.getIsViewed())
		.forEach(m -> contentReport.append(m.toString()));
		
		//Predicate<Serie> seriesViewed = s -> s.getIsViewed();
		Consumer<Serie> seriesEach = s -> {
		ArrayList<Chapter> chapters  = s.getChapters();
		chapters.stream().filter(c -> c.getIsViewed()).forEach(m -> contentReport.append(m.toString()));
		};
		
		series.stream()
		.forEach(seriesEach);
		
		books.stream()
		.filter(b -> b.isReaded())
		.forEach(b -> contentReport.append(b.toString()));

		report.setContent(contentReport.toString());
		report.makeReport();
		System.out.println("Reporte Generado");
		System.out.println();
	}

	public static void makeReport(Date date) {
		
		Date dateToday = new Date ();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh-m-ss-S");
		String dateString = df.format(dateToday);
		
		Report report = new Report();
		report.setNameFile("reporte-" + dateString);
		report.setExtension("txt");
		report.setTittle("\n\n\t:: VISTOS - " + new SimpleDateFormat("EEE, d MMM yyyy").format(date) + " ::");

		SimpleDateFormat dfNameDays = new SimpleDateFormat("EE, d MMM Y, hh:mm:ss a");
		dateString = dfNameDays.format(dateToday);
		String contentReport = "Report date: " + dateString + report.getTittle();
		
		ArrayList<Movie> movies_date = new ArrayList<>();
		  movies_date = Movie.makeMoviesListDate(date);
		  
		  for (Movie movie : movies_date) {
		    contentReport += "\n\n" + movie;
		  }

		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";

			}
		}

		for (Serie serie : series) {
			ArrayList<Chapter> chapters = serie.getChapters();
			for (Chapter chapter : chapters) {
				if (chapter.getIsViewed()) {
					contentReport += chapter.toString() + "\n";

				}
			}
		}

		for (Book book : books) {
			if (book.isReaded()) {
				contentReport += book.toString() + "\n";

			}
		}
		report.setContent(contentReport);
		report.makeReport();

		System.out.println("Reporte Generado");
		System.out.println();
	}

}
