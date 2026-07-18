package com.krakedev;

public class Calculadora {
	
	//----Crear metodos
	
	
	public int sumar(int a, int b) {
		
		int resultado = a+b;
		
		return resultado;
	}//fin sumar
	
	
	public int restar(int a, int b) {
		
		int resultado = a-b;	
		
		return resultado;
	}//fin restar
	
	
	public double multiplicar(double valor1, double valor2) {
		
		double resultado = valor1*valor2;
		
		return resultado;
	}//fin multiplicar
	
	
	
	public double dividir(double dividendo, double divisor) {
		
		double cociente = dividendo / divisor;
		
		return cociente;		
	}//fin dividir
	
	
	
	public double promediar(double valor1, double valor2, double valor3) {
		
		double promedio = (valor1 + valor2 + valor3)/3.0;
				
		return promedio;
	}// fin promediar
	
	
	
	public void mostrarResultado() {
		
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}
	
		

}//fin
