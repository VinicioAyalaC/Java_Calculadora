package com.krakedev;

public class Cuadrado {
	
	public double lado;
	
	
	
	public double calcularArea() {		
		
		double areaC = Math.pow(lado,2);  //Math.pow(base, exponente)
		
		return areaC;
	}
	
	
	
	
	
	public double calcularPerimetro() {
		
		double perimetro = lado * 4;		
		
		return perimetro;
	}
	
	

}
