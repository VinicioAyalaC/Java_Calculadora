package com.krakedev;

public class CuadradoTest {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		
		c1.setLado(12);
		double area1 = c1.calcularArea();
		System.out.println("El Area del cuadrado es: " + area1);
		
		double perimetro1 = c1.calcularPerimetro();
		System.out.println("El Perimetro del cuadrado es:" + perimetro1);	
		

	}//main

}//fin
