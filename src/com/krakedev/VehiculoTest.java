package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		//-------------------------------------------------
		Vehiculo v1= new Vehiculo();		
		
		System.out.println("---------Vehiculo 1: Inicializando");
		System.out.println("Marca:  " + v1.marca);
		System.out.println("Modelo: " + v1.modelo);
		System.out.println("Año:    " + v1.anio);
		
		v1.marca= "Hyundai";
		v1.modelo= "Jep";
		v1.anio="2026";
		
		System.out.println("---------Vehiculo 1: Con datos");
		System.out.println("Marca:  " + v1.marca);
		System.out.println("Modelo: " + v1.modelo);
		System.out.println("Año:    " + v1.anio);
		
		
		System.out.println("\n"); //salto de linea
		//-------------------------------------------------
		Vehiculo v2= new Vehiculo();		
		
		System.out.println("---------Vehiculo 2: Inicializando");
		System.out.println("Marca:  " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);
		System.out.println("Año:    " + v2.anio);
		
		v2.marca= "Hyundai";
		v2.modelo= "Jep";
		v2.anio="2026";
		
		System.out.println("---------Vehiculo 2: Con datos");
		System.out.println("Marca:  " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);
		System.out.println("Año:    " + v2.anio);
		

	}

}
