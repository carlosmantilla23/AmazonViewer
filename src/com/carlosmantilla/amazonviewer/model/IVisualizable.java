package com.carlosmantilla.amazonviewer.model;

import java.util.Date;

/**
 * 
 * 
 * @author carlosmantilla
 *
 */

public interface IVisualizable {
	
	/**
	 * Este método captura el tiempo exacto de inicio de visualización
	 * @param dateInicial es un objeto {@code date} con el tiempo de inicio exacto.
	 * @return Devuelve la fecha y hora capturada
	 * */
	
	Date startToSee(Date dateInicial);
	
	
	/**
	 * Este método captura el tiempo exacto de inicio y final de visualización
	 * @param dateInicial es un objeto {@code date} con el tiempo de inicio exacto.
	 * @param dateFinal es un objeto {@code date} con el tiempo de final exacto.
	 * 
	 * */
	void stopToSee(Date dateInicial, Date dateFinal);

}
