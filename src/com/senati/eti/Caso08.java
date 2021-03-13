package com.senati.eti;

import java.util.Scanner;

public class Caso08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado: ");
		int lado = sc.nextInt();
		
		int area = (int)Math.pow(lado, 2);
		
		int perimetro = lado * 4;
		
		System.out.println("-------- R E S U L T A D O S --------");
		System.out.println("El área del cuadrado es "+ area);
		System.out.println("El perímetro del cuadrado es "+ perimetro);
		
		
		
	}

}
