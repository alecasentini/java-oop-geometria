package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;
	
	public Rettangolo (int base, int altezza) {
		
		this.base = base;
		this.altezza = altezza;
	};
	
	public int calcolaArea() {
		return (base * altezza);
	}
	
	public int calcolaPerimetro() {
		return ((base * 2) + (altezza * 2));
	}
	
	public void printResult (int i) {
		System.out.println("\nRettangolo " + i + ": ");
		System.out.println("Base: " + base);
		System.out.println("Altezza: " + altezza);
		System.out.println("Perimetro: " + calcolaPerimetro());
		System.out.println("Area: " + calcolaArea());
		
		System.out.println("\n-------------------\n");
	}
}
