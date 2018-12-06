package com.carlosmantilla.amazonviewer.model;

public class Film {
	
	
	private String tittle;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if (viewed == true) {
			visto = "Si";
		} else {
			visto = "No";
		}
		return visto;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	public Film(String tittle, String genre, String creator, int duration) {
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	

}
