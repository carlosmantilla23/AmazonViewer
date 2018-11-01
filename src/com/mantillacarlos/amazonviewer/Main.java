package com.mantillacarlos.amazonviewer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int exit = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada:");
			System.out.println("1 - Movies");
			System.out.println("2 - Series");
			System.out.println("3 - Books");
			System.out.println("4 - Magazines");
			System.out.println("0 - Salida");

			// Leer la respuesta del usuario:
			sc.nextInt();
			switch (exit) {
			case 1:
				System.out.println("MOVIES: ");
				break;
			case 2:
				System.out.println("SERIES: ");
				break;
			case 3:
				System.out.println("BOOKS: ");
				break;
			case 4:
				System.out.println("MAGAZINES: ");
				break;
			default:
				break;
			}

		} while (exit != 0);

	}

}
