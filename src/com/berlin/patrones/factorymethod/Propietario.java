package com.berlin.patrones.factorymethod;

public class Propietario {
	private String nombre;
	private Animal mascota;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Animal getMascota() {
		return mascota;
	}
	public void setMascota(Animal mascota) {
		this.mascota = mascota;
	}

	
}
