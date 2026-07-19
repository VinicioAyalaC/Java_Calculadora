package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		//-------------------------------------------------
		Vehiculo v1= new Vehiculo();		
		
		System.out.println("---------Vehiculo 1: Inicializando");
		System.out.println("Marca:  " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Año:    " + v1.getAnio());
		
		v1.setMarca("Hyundai");
		v1.setModelo("Jep");
		v1.setAnio("2026");
		
		System.out.println("---------Vehiculo 1: Con datos");
		System.out.println("Marca:  " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Año:    " + v1.getAnio());
		
		
		System.out.println("\n"); //salto de linea
		//-------------------------------------------------
		Vehiculo v2= new Vehiculo();		
		
		System.out.println("---------Vehiculo 2: Inicializando");
		System.out.println("Marca:  " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Año:    " + v2.getAnio());
		
		v2.setMarca("Hyundai") ;
		v2.setMarca("Jep");
		v2.setAnio("2026");
		
		System.out.println("---------Vehiculo 2: Con datos");
		System.out.println("Marca:  " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Año:    " + v2.getAnio());
		

	}

}
