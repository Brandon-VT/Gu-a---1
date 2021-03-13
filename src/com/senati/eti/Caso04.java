package com.senati.eti;

import java.util.Scanner;

public class Caso04 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		float n1 , n2;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float mult = n1 * n2;
		float div = n1 / n2;
		float resto = n1 % n2;
		System.out.println("R E S U L T A D O S");
		System.out.println("Suma....................:" + suma);
		System.out.println("Resta...................:" + resta);
		System.out.println("Múltiplicacion..........:" + mult);
		System.out.println("División................:" + div);
		System.out.println("Resto...................:" + resto);
		
		
		
		
	}

}
