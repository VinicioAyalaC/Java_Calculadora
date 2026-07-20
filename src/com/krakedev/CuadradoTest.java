package com.krakedev;

public class CuadradoTest {

	public static void main(String[] args) {	
		
		//  con constructor
		Cuadrado c2 = new Cuadrado(10);
				
		double area2 = c2.calcularArea();
		System.out.println("El Area del cuadrado es: " + area2);
		
		double perimetro2 = c2.calcularPerimetro();
		System.out.println("El Perimetro del cuadrado es:" + perimetro2);	
		

	}//main

}//fin
