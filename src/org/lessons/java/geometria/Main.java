package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0 ; i<3; i++) {
		
			System.out.print("Aggiungi un valore per la base del rettangolo: ");
			int base = sc.nextInt();
			
			System.out.print("Aggiungi un valore per l'altezza del rettangolo:");
			int altezza = sc.nextInt();
			
			Rettangolo rettangolo = new Rettangolo(base,altezza);
			
			rettangolo.printResult(i+1);
			rettangolo.disegna();
		}
	}

}
