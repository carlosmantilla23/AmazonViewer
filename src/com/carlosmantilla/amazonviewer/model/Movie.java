package com.carlosmantilla.amazonviewer.model;

public class Movie extends Film {

	private int id;
	private int timeViewed;

	public void showData() {
		// System.out.println("Tittle: " + tittle);
		// System.out.println("Genre: " + genre);
		// System.out.println("Year: " + year);
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

	public Movie(String tittle, String genre, String creator, int duration, short year) {
		super(tittle, genre, creator, duration);
		setYear(year);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tittle: " + getTittle() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

}
