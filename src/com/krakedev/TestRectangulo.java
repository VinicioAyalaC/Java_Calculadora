package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		

		Rectangulo r1 = new Rectangulo();		
		r1.base = 10;
		r1.altura = 5;
		
		int resultadoArea1 = r1.calcularArea();		
		System.out.println("El area 1 es: " + resultadoArea1 );		
		
		
		
		Rectangulo r2 = new Rectangulo();
		r2.base = 8;
		r2.altura = 6;
		
		int resultadoArea2 = r2.calcularArea();
		System.out.println("El area 2 es: " + resultadoArea2);
		
	}

}//fin principal
