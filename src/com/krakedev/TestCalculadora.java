package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int resultadoSuma = c1.sumar(9, 5);		
		System.out.println("La suma es: "+resultadoSuma);
		
		
		System.out.println("\n");		
		int resultadoResta = c1.restar(9, 5);
		System.out.println("La resta es: "+resultadoResta);
		
		System.out.println("\n");
		double resultadoMultiplicar = c1.multiplicar(9, 5);
		System.out.println("La multiplicacion es: " + resultadoMultiplicar);
		
		System.out.println("\n");
		double resultadoDividir = c1.dividir(9, 5);
		System.out.println("La division es: " + resultadoDividir);

		
		System.out.println("\n");
		double resultadoPromediar = c1.promediar(10, 8, 5);
		System.out.println("El promedio es: " + resultadoPromediar);
		
		
		System.out.println("\n");
		c1.mostrarResultado();
		
		
	}

}
