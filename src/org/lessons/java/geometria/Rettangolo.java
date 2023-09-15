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
		
		
	}
	
	public void disegna() {
		for (int i = 0; i < base; i++) {
	        System.out.print("o");
	    }
	    System.out.println();

	    for (int a = 0; a < altezza - 2; a++) {
	        System.out.print("o");
	        for (int b = 0; b < base - 2; b++) {
	            System.out.print(" ");
	        }
	        System.out.println("o");
	    }
	    
	    for (int i = 0; i < base; i++) {
            System.out.print("o");
        }
        System.out.println();
		
		System.out.println("\n-------------------\n");
	}
}
