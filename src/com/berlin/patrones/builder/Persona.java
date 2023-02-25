package com.berlin.patrones.builder;

public class Persona {
	private String nombre;
	private int edad;

	private Persona(PersonaBuilder builder) {
		nombre = builder.nombre;
		edad = builder.edad;
	}

	public static PersonaBuilder builder() {
		return new PersonaBuilder();
	}

	public static class PersonaBuilder {
		private String nombre;
		private int edad;

		private PersonaBuilder() {
		}

		public PersonaBuilder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public PersonaBuilder edad(int edad) {
			this.edad = edad;
			return this;
		}

		public Persona build() {
			return new Persona(this);
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}