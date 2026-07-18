package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int resultadoSuma = c1.sumar(9, 5);		
		System.out.println("La suma es: "+resultadoSuma);
		
		System.out.println("\n");
		
		int resultadoResta = c1.restar(9, 5);
		System.out.println("La resta es: "+resultadoResta);

	}

}
