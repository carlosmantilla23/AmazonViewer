package com.carlosmantilla.amazonviewer.model;

public class Chapter extends Movie {

	private int id;
	private int sessionNumber;

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	

	public Chapter(String tittle, String genre, String creator, int duration, short year, int sessionNumber) {
		super(tittle, genre, creator, duration, year);
		this.setSessionNumber(sessionNumber);

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: CHAPTER ::"+
				"\n Tittle: " + getTittle() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

}
