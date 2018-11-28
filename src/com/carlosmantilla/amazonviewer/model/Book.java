package com.carlosmantilla.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable {

	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;

	public Book(String tittle, Date editionDate, String editorial, String[] autores, String isbn) {
		super(tittle, editionDate, editorial, autores);
		// TODO Auto-generated constructor stub
		this.isbn = isbn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = "\n :: BOOK ::" + "\n Tittle: " + getTittle() + "\n Edition Date: " + getEditionDate()
				+ "\n Editorial: " + getEditorial() + "\n Autores: " + getAutores() + "\n ISBN: " + getIsbn();
		for (int i = 0; i < getAutores().length; i++) {
			detailBook += "\t" + getAutores()[i];
		}
		return detailBook;
	}

	@Override
	public Date startToSee(Date dateInicial) {
		// TODO Auto-generated method stub
		return dateInicial;
	}

	@Override
	public void stopToSee(Date dateInicial, Date dateFinal) {
		// TODO Auto-generated method stub
		if (dateFinal.getSeconds() > dateInicial.getSeconds()) {
			setTimeReaded(dateFinal.getSeconds() - dateInicial.getSeconds());
		} else {
			setTimeReaded(0);
		}
	}
}
