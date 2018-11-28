package com.carlosmantilla.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	Date startToSee(Date dateInicial);
	void stopToSee(Date dateInicial, Date dateFinal);

}
