package com.senati.eti;

public class Caso12 {
	
	public static void main(String[] args) {
		String frase = "ESCUELA DE TECNOLOG�A E INFORMATICA";
		String p1 = frase.substring(0,7 );   // ESCUELA
		String p2 = frase.substring(11, 21);  // TECNOLOG�A
		String p3 = frase.substring(24, 35);  //INFORMATICA
		
		
		System.out.println("-------- R E S U L T A D O S --------");
		System.out.println("Palabra 1..............: " + p1);
		System.out.println("Palabra 2..............: " + p2);
		System.out.println("Palabra 3..............: " + p3);
		
		
		
		
		
	}

}
