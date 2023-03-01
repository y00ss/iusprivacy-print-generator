package com.iusprivacy.printgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrintGeneratorApplication.class, args);
	}


	/**
	 * Creazione del progetto :
	 * 1) Creare tutte le entity interessate alla lettura e scrittura del db
	 * 2) Creare tutti i repository specificati
	 * 3) Dividere le tabelle con le query di suddivisione
	 * 4) Creare le DTO come risultato alle query di join
	 * 5) inziiare fase di lettura dei dati e implememtazione di freemarker
	 * 6) creare funzione html
	 * 	6.1) Partire con le tabelle
	 * 	6.2) cicli dettagliati sul for
	 * 7) conversione del file html prodotto in pdf
	 * 	7.1) utilizzare itext
	 *
	 * 8) testing junit */

	//todo chiedere a roberto che tipo di loibreria utilizza itext free o comunity


}
