package com.krakedev;

public class Cuadrado {
	
	private double lado;
	
	
	// get & set
	
	public double getLado() {		return lado;	}

	public void setLado(double lado) {		this.lado = lado;	}
	
	
	
	//---------------------------------------------------------
	public double calcularArea() {		
		
		double areaC = Math.pow(lado,2);  //Math.pow(base, exponente)
		
		return areaC;
	}	
	
	



	public double calcularPerimetro() {
		
		double perimetro = lado * 4;		
		
		return perimetro;
	}
	
	

}
