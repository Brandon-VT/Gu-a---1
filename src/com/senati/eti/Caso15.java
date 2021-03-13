package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.println("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float importe_s = cantidad * precio;
		float importe_d = importe_s / 3.24f;
		
		System.out.println("R E S U L T A D O S");
		System.out.println("Importe en soles: " + df.format(importe_s));
		System.out.println("Importe en dólares: " + df.format(importe_d));
		
		
		
		
	}

}
