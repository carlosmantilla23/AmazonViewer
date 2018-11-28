package com.carlosmantilla.amazonviewer.model;

import java.util.Date;

public class Publication {
	
	private String tittle;
	private Date editionDate;
	private String editorial;
	private String[] autores;

	public Publication(String tittle, Date editionDate, String editorial, String[] autores) {
		super();
		this.tittle = tittle;
		this.editionDate = editionDate;
		this.editorial = editorial;
		this.autores = autores;
	}
	
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	
	

}
