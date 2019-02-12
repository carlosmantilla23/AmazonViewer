package com.carlosmantilla.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.carlosmantilla.amazonviewer.db.Database.*;

public interface IDBConnection {

	default Connection connectToDB() {

		Connection connection = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL+DB, USER, PASSWORD);
			
			if (connection!=null) {
				System.out.println("Se estableció la conexión a la base de datos");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		return connection;

	}

}
