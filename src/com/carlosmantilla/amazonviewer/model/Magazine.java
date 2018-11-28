package com.carlosmantilla.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {

	private int id;

	public Magazine(String tittle, Date editionDate, String editorial, String[] autores) {
		super(tittle, editionDate, editorial, autores);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
