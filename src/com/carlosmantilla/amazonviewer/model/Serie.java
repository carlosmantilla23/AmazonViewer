package com.carlosmantilla.amazonviewer.model;

public class Serie extends Film {

	private int id;
	private int sessionQuantity;
	private Chapter[] chapters;

	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}

	public Serie(String tittle, String genre, String creator, int duration, int sessionQuantity) {
		super(tittle, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tittle: " + getTittle() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration()+
				"\n sessionQuantity: " + getSessionQuantity();
	}

}
