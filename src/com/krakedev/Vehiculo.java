package com.krakedev;

// *plantilla para crear vehiculo

public class Vehiculo {
	
	
	// variables/atributos
	private String marca;
	private String modelo;
	private String anio;
	private double valor;
	
	
	// constructores
	
	
	
	//Constructor vacio o por defecto
	public Vehiculo() {
		
	}
	
	
	//Constructor con un atributo
	public Vehiculo(String marca) {
		this.marca  = marca;	
	}
	
	
	
	//Contructor con 3 atributos
	public Vehiculo(String marca, String modelo, String anio) {
		this.marca  = marca;
		this.modelo = modelo;
		this.anio   = anio;
	}
	
	
	
	// metodos: get & set
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	

	
	
	
	
	
}
