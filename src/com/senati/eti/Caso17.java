package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Número de aprobados: ");
		int na = sc.nextInt();
		
		System.out.println("Número de desaprobados: ");
		int nd = sc.nextInt();
		
		System.out.println("Número de retirados: ");
		int nr = sc.nextInt();
		
		float total = na + nd + nr;
		
		float pa = (na/total)*100;
		float pd = (nd/total)*100;
		float pr = (nr/total)*100;
		
		System.out.println("R E S U L T A D O S");
		System.out.println("Aprobados: " + df.format(pa) + " %");
		System.out.println("Desaprobados: " + df.format(pd) + " %");
		System.out.println("Retirados: " + df.format(pr) + " %");
	}

}
