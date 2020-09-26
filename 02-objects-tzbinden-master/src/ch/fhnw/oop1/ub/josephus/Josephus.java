package ch.fhnw.oop1.ub.josephus;

import java.util.Scanner;

/**
 * Der Josephusring ist eine Implementierung eines Abzählreimes. Er wurde verwendet 
 * um zu bestimmen, welcher Gefangene am Geburtstag des Königs freigelassen werden 
 * soll. Die Gefangenen mussten sich dazu im Kreis aufstellen. Nun wurde, beginnend 
 * mit dem ersten Gefangenen, reihum von 1 bis zu einer vorher festgelegten 
 * "fatalen Zahl" abgezählt. Wer die fatale Zahl traf, der musste weiterhin im 
 * Gefängnis bleiben und das Abzählen wurde mit dem nächsten Gefangenen neu begonnen. 
 * Der Letzte, der übrig blieb, wurde schliesslich begnadigt.
 * 
 * Diese Klasse implementiert den Josephusring.
 */
public class Josephus {

	/**
	 * Main.
	 * 
	 * @param args Der Args String Array
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numberOfPrisoners = s.nextInt();
		
		int fatalNumber = s.nextInt();
		
		s.close();
		
		int survivor = computeSurvivor(numberOfPrisoners, fatalNumber);
		System.out.println(survivor);
	}

	/**
	 * Berechnet die Position des Gefangenen, welcher begnadigt wird. Ist numberOfPrisoners = 4, 
	 * dann gibt es die Gefangenen 0, 1, 2, 3. Diese Gefangenen bilden den Josephusring.
	 * Wird z.B. 0 zurückgegeben, dann wird der Gefangene 0 begnadigt.
	 * 
	 * @param numberOfPrisoners  Die Anzahl der Gefangenen
	 * @param fatalNumber  Die Abzählnummer
	 * @return Die Gnadenposition
	 */
	static int computeSurvivor(int numberOfPrisoners, int fatalNumber) {
	
		// TODO: Your code here...
		
		return -1;
	}
}