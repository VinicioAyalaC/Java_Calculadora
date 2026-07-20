package com.krakedev;

public class Rectangulo {
	
	
	//---- Atributos
	private int base;
	private int altura;
	
	
	
	//---- Constructor
	public Rectangulo(int base, int altura) {
		this.base   = base;
		this.altura = altura;
	}	
	
	
	//---- get & set
	public int getBase() {	return base;	}
	public void setBase(int base) {		this.base = base;	}

	public int getAltura() {  return altura;	}
	public void setAltura(int altura) {	this.altura = altura;	}
		
	
	//---- Metodos
	public int calcularArea() {		
		
		int area = base * altura;
		
		return area;
	}


	public double calcularPerimetro() {
		
		double perimetro = 2*(base + altura);		
		
		return perimetro;
	}
	
	
}//principal
