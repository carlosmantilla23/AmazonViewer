package com.carlosmantilla.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

import com.carlosmantilla.amazonviewer.dao.MovieDAO;

/**
 * Hereda de {@link Film} Implementa de {@link IVisualizable}
 * 
 */

public class Movie extends Film implements IVisualizable, MovieDAO {

	private int id;
	private int timeViewed;

	public Movie() {

	}

	public Movie(String tittle, String genre, String creator, int duration, short year) {
		super(tittle, genre, creator, duration);
		setYear(year);
	}

	public void showData() {
		// System.out.println("Title:" + title);
		// System.out.println("Genre:" + genre);
		// System.out.println("Year:" + year);
	}

	public void setId(int id) {
		this.id = id;
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
		// TODO Auto-generated method stub
		return "\n :: MOVIE ::" + "\n Title: " + getTittle() + "\n Genero: " + getGenre() + "\n Year: " + getYear()
				+ "\n Creator: " + getCreator() + "\n Duration: " + getDuration();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub

		if (dateF.getTime() > dateI.getTime()) {
			setTimeViewed((int) (dateF.getTime() - dateI.getTime()));
		} else {
			setTimeViewed(0);
		}

	}

	public static ArrayList<Movie> makeMoviesList() {
		
		Movie movie = new Movie();
		return movie.read();
		
		
	}
	
	public static ArrayList<Movie> makeMoviesListDate(Date date) {
		  Movie movie = new Movie();
		  return movie.getMoviesViewedByDate(date);
		}  

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void view() {
		// TODO Auto-generated method stub
		setViewed(true);
		Movie movie = new Movie();
		movie.setMovieViewed(this);
		Date dateI = startToSee(new Date());

		for (int i = 0; i < 100; i++) {
			System.out.println("..........");
		}

		// Termine de verla
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Viste: " + toString());
		System.out.println("Por: " + getTimeViewed() + " milisegundos");

	}

}
