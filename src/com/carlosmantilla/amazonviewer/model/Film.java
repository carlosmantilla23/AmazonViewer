package com.carlosmantilla.amazonviewer.model;

/**
 * <h1>Film</h1>
 * Film es una clase padre abstracta
 * <p>
 * Esta clase es la clase base de la familia films, como es abstracta no pueden crearse instancias.
 * Contiene el método abstracto {@code view()} 
 * 
 * @author carlosmantilla
 * @version 1.1
 * @since 2019
 * 
 * */

public abstract class Film {
	
	private String tittle;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	
	
	public Film(String tittle, String genre, String creator, int duration) {
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
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
		if(viewed == true) {
			visto = "Sí";
		}else {
			visto = "No";
		}
		
		return visto;
	}
	
	public boolean getIsViewed() {
		return viewed;
	}
	
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	/**
	 * {@code view()} es un método abstracto obligatorio de implementar
	 * */
	public abstract void view();
	

}
